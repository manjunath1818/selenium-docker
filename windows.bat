set projectLocation=D:\workspace\ExtentReports
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\Grid.xml
pause