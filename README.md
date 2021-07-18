# Fetchr
Fetchr Automation Test Engineer

this scripts implemented using "Katalon"
Please follow the below steps to run the test
1-install Katalon studio,
  a-navigate to "Katalon" offecial website "https://www.katalon.com/"
  b-Sign up using your Email
  c-Start Downloading "Katalon Studio" the compatible edition for your OS
  d-after its installed on you PC unzip the file and run the katalon.exe

2-Now Katalon is installed and running on you local machine
3-Open a new Project From File > New > Project
4-Name the Project Fetchr and click "OK"
5-Clone the Fetchr Project from GitHub using the Git icon below the menu bar on katalon studio *note leave the git UN/PW fields empty

6-Now we have the Project ready to Run, below are the needed,
  a-Profiles -- where we save our test data as a static message and tracking numbers
  b-Test Cases -- where is the implemintation and scripts of our test cases we can run each one after open it by 'double click it' and clicking the green play arrow on the bar below menubar
  c-Object repository -- where is all of our elements as textboxes images and more
  d-Test Suites -- its a collection of test cases that will export and Email a report
  
 7-Now to run a test you need to open a test case/test suite and click the green play button above it
 
 
 Notes,
 1-Some of test cases may fails due to uncorrect data
 2-Test Cases (4 and 5) will fails due to a bug that the change lang button does works when we are inside terms and conditions and privacy pages
 3-The Covid-19 label hiding the change lang button on home page, and after closing it we need to press twice first time at the button to responde
 4-The Nav-bar is hiding the fulll-screen button on the map screen
 5-call us button is not functioning since we are on web but we are verifying the number "tel:+97148018100" on our test cases
