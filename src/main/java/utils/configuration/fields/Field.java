package utils.configuration.fields;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;


/**
 * The interface Field.
 */
public interface Field {
    /**
     * The constant locator.
     */
    String locator = "";

    /**
     * Gets resources.
     *
     * @param data the data
     * @return the resources
     */
    String getResources(String data);

    /**
     * Field selenide element.
     *
     * @param locator the locator
     * @return the selenide element
     */
    SelenideElement field(String locator);

    /**
     * Fields elements collection.
     *
     * @param locator the locator
     * @return the elements collection
     */
    ElementsCollection fields(String locator);

    /**
     * Fields selenide element.
     *
     * @param locator the locator
     * @param index   the index
     * @return the selenide element
     */
    SelenideElement fields(String locator, int index);

    /**
     * Gets child.
     *
     * @param parent the parent
     * @param id     the id
     * @param child  the child
     * @return the child
     */
    SelenideElement getChild(String parent, int id, String child);

    /**
     * Gets child.
     *
     * @param parent the parent
     * @param child  the child
     * @return the child
     */
    SelenideElement getChild(String parent, String child);

    /**
     * Gets children collection.
     *
     * @param parent the parent
     * @param id     the id
     * @param child  the child
     * @return the children collection
     */
    ElementsCollection getChildrenCollection(String parent, int id, String child);

    /**
     * Gets children.
     *
     * @param parent the parent
     * @param id     the id
     * @param child  the child
     * @return the children
     */
    SelenideElement getChildren(String parent, int id, String child);

    /**
     * Gets children.
     *
     * @param parent  the parent
     * @param id      the id
     * @param child   the child
     * @param childId the child id
     * @return the children
     */
    SelenideElement getChildren(String parent, int id, String child, int childId);

    /**
     * Gets children.
     *
     * @param parent the parent
     * @param child  the child
     * @param id     the id
     * @return the children
     */
    SelenideElement getChildren(String parent, String child, int id);

    //Chose value from drop-down
    // implemented via JS code
    void SelectValueFromDropDown(String dropDownLocator, String value);
}
