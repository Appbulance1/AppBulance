Setting up Android SDK
---------------------------
Get the Android Development Kit at http://developer.android.com/sdk/index.html#download.
Unzip the archive.

You need to run this program to set up the development environment before starting to code.

*On Windows:*
Run the program named "SDK Manager". 
On the list of packages choose "Android SDK 2.2 (API 8)" then click "Install XX packages" button.

*On Mac:*
Enter the "eclipse" folder and run Eclipse. Choose "Window->Android SDK Manager". 
Choose "Android SDK 2.2 (API 8)" then click "Install XX packages" button.

Then create a "virtual device" so that you will be able to test/simulate your programs. "Windows->Android virtual Device manager". 
On the opened dialog choose "create device", which opens another dialog. 
There choosing, for example the first device (Nexus 7) is sufficient (do not choose glass or wearable).
In Target menu choose Android 2.2, and create the device with these options so far.

For those starting with Android development for the first time, Engin has shared an example application with us
during the workshop. You will find it in "devel" folder with name "mytest". Inport this example app using "import project", with "copy projects into workspace" option.

Once you import the project you can run it by right clicking on the project root (in the tree view) and choose "Run as android app". The opened window will show a menu as "Emulator-64-ARM", there choose to run your application.
