powershell
Set-ExecutionPolicy RemoteSigned -scope CurrentUser
iex (new-object net.webclient).downloadstring('https://get.scoop.sh')
scoop install allure
allure serve .\build\allure-results\


gradle wrapper --gradle-version 5.4.1
./gradlew build
./gradlew
./gradlew test


 gradle test --tests *SmokeWebTest -Dselenide.baseUrl=https://mechanic.boston