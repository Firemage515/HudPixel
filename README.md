# HudPixel Mod
### An unofficial client-side Minecraft modification designed for the Hypixel Network.

**Check the [Forum Thread](http://hypixel.net/threads/client-mod-hudpixel-reloaded-overlay-with-extra-information.204572/) for more information.**

#### Contributing
This mod is open source and contributions are always welcome.

### Build server
There is a buildserver located at http://palechip.com. It contains to the day builds of the repository. However please keep in mind that the builds there don't have to be as stable as the recommended builds. These builds are primarily aimed at testers.

#### How to build/compile the mod
 1. Make sure you have the Java Development Kit (jdk) installed
 2. Download the sources
 3. Open a command line in the main directory (where this readme is located)
 4. Run `gradlew build`
 5. Grab your build in `build\libs`

#### How to setup your IDE to work with this mod
 1. Make sure you have the Java Development Kit (jdk) installed
 2. Download the sources (ideally use a fork so you can do a pull request)
 3. Open a command line in the main directory (where this readme is located)
 4. Run `gradlew setupDecompWorkspace --refresh-dependencies`
 5. If you are using IntelliJ IDEA as IDE, run `gradlew idea`
 6. If you are using Eclipse as IDE, head to [files.minecraftforge.net](http://files.minecraftforge.net), download the source code of the used version of Forge, unzip it and copy the `eclipse` folder into the main directory. Then run `gradlew eclipse`.
 7. Open the project with your IDE (for Eclipse: Point your workspace to the `eclipse` folder)
 8. Make sure you are using the Java Conventions for Formatting the code, but tell it to avoid tabs. (This is especially important for bigger pull requests. If you don't know how to do it, I'll help you once you make a pull request.)
 9. To be able to test the mod on the server, configure the IDE to pass Minecraft the following arguments on start `--username YOURUSERNAMEOREMAIL --password YOURPASSWORD` Use the data you are using to log in to the Minecraft launcher.

 P0ke's fork of the awesome mod HudPixel