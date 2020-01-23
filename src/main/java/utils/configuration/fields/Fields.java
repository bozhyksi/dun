package utils.configuration.fields;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.CommonPopup.AddressGrid.IAddressGrid;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;

import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Selenide.*;
import static utils.configuration.rules.PropertiesReader.readFromTheFile;

/**
 * The type Fields.
 */
public class Fields implements Field {

    private String locator = "";

    private String getPathToThis() {
        return System.getProperty("user.dir") + "\\src\\main\\java\\" + this.getClass().getName().replace(".", "\\") + ".properties";
    }


    private String screenTemplate() {
        return screenshot(this.getClass().getName().replace(".", "\\") + new Timestamp(System.currentTimeMillis()).toString().replaceAll("\\D", ""));
    }


    @Override
    public String getResources(String data) {
        try {
            return readFromTheFile(getPathToThis(), data);
        } catch (IOException e) {
            System.out.println("Cannot find the file" + e);
            return null;
        }
    }

    @Override
    public SelenideElement field(String locator) {
        System.out.println("Locator of field\n" + getResources(locator));
        //screenTemplate();
        return $(By.xpath(getResources(locator)));
    }

    @Override
    public ElementsCollection fields(String locator) {
        System.out.println("Locator of fields\n" + getResources(locator));
        //screenTemplate();
        return $$(By.xpath(getResources(locator)));
    }

    @Override
    public SelenideElement fields(String locator, int index) {
        this.locator = getResources(locator);
        System.out.println("Locator of fields\n" + this.locator + "[" + index + "]");
        // screenTemplate();
        return $$(By.xpath(this.locator)).get(index);
    }

    @Override
    public SelenideElement getChild(String parent, int id, String child) {
        locator = getResources(parent) + "[" + id + "]" + getResources(child);
        System.out.println("Locator of field with child\n" + locator);
        //screenTemplate();
        return $(By.xpath(locator));
    }

    @Override
    public SelenideElement getChild(String parent, String child) {
        locator = getResources(parent) + getResources(child);
        System.out.println("Locator of field with child\n" + locator);
        //screenTemplate();
        return $(By.xpath(locator));
    }

    @Override
    public SelenideElement getChildren(String parent, int id, String child) {
        locator = getResources(parent) + "[" + id + "]" + getResources(child);
        System.out.println("Locator of field with children\n" + locator);
        //screenTemplate();
        return $$(By.xpath(locator)).get(0);
    }

    @Override
    public SelenideElement getChildren(String parent, int id, String child, int childId) {
        locator = getResources(parent) + "[" + id + "]" + getResources(child);
        System.out.println("Locator of field with children\n" + locator + "[" + childId + "]");
        //screenTemplate();
        return $$(By.xpath(locator)).get(childId);
    }

    @Override
    public ElementsCollection getChildrenCollection(String parent, int id, String child) {
        locator = getResources(parent) + "[" + id + "]" + getResources(child);
        System.out.println("Locator of field with children\n" + locator);
        //screenTemplate();
        return $$(By.xpath(locator));
    }

    @Override
    public SelenideElement getChildren(String parent, String child, int index) {
        String locator = getResources(parent) + getResources(child);
        System.out.println("Locator of field with children\n" + locator + "[" + index + "]");
        //screenTemplate();
        return $$(By.xpath(locator)).get(index);
    }

    /**
     * Fields selenide element.
     *
     * @param locator the locator
     * @param name    the name
     * @return the selenide element
     */
    public SelenideElement fields(String locator, String name) {
        int value = 0;
        ArrayList<String> list = new ArrayList<>();
        ElementsCollection field = fields(locator);

        for (SelenideElement selenideElement : field) {
            list.add(selenideElement.getText());
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(name)) {
                System.out.println(list.get(i));
                value = i;
            }
        }

        return field.get(value);
    }

    @Override
    public void SelectValueFromDropDown(String dropDownLocator, String value) {
        String path = getResources(dropDownLocator);

        String JScode = "var el = document.evaluate( \"%1s\", document, null, XPathResult.ANY_TYPE, null );" +
                "var search = \"%2s\";" +
                "var found;" +
                "var step = el.iterateNext();" +
                "while(step){" +
                "  if(step.textContent == search)" +
                "    {" +
                "        found=step;" +
                "        break;" +
                "    }" +
                "    step = el.iterateNext();" +
                "}" +
                "found.click();";
        String script = String.format(JScode, path, value);
        Selenide.executeJavaScript(script);
    }

    public void RefreshPage() {
        Selenide.refresh();
        WaitForLoad();
    }

    public <T extends IAddressGrid> void FillAddressGrid(T obj) {
        String Address = "880 Dixon Park";
        String StreetLine1 = "05913 Kensington Avenue";
        String City = "Johannesburg";
        String PostalCode = "8154224";
        String Province = "Gauteng";
        String Country = "South Africa";

        obj.AddressLine().click();
        obj.AddressField().val(Address);
        obj.StreetLine1().val(StreetLine1);
        obj.City().val(City);
        obj.Code().val(PostalCode);
        obj.Province().val(Province);
        obj.Country().val(Country);
        obj.AddressSubmitButton().click();
    }

    public void WaitForLoad() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String loaderSpinnerLocator = "//progress-spinner//div[@class=\"spiner-background ng-star-inserted\"]";
        SelenideElement loaderSpinner = $(By.xpath(loaderSpinnerLocator));
        loaderSpinner.waitUntil(disappear, 10000);

        for (int i = 0; i < 100; i++) {
            ElementsCollection loader = $$(By.xpath(loaderSpinnerLocator));
            if (loader.size() > 0) {
                try {
                    Thread.sleep(i * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                loader.size();
                break;
            }
        }
    }

    protected SelenideElement getElementBySiblingName(String list1Locator, String list2Locator, String name) {
        ElementsCollection list1 = fields(list1Locator);
        ElementsCollection list2 = fields(list2Locator);

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).text().equals(name)) {
                return list2.get(i);
            }
        }
        return null;
    }


}