LogToFile-Android
=================
##What is this?
A simple logging mechanism to write to an external file in your application folder. 

##When can it be useful?
The log could be helpful during the testing stages to check where exactly your app is crashing at user end.

##How to call?
Add the class file to your project and call the class in your activity as follows:

LogToFile log = new LogToFile();

After creating an object of the class, call the following method wherever you think the log is required for the activity.

log.writeData(this, "Log initialized!");

