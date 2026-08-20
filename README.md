# Weave's Mod Template for Kotlin

This repository shows how to setup a [Gradle](https://gradle.org) project with the [Weave Gradle plugin](https://github.com/Weave-MC/Weave-Gradle) to develop mods for Weave in Kotlin.
This template uses Kotlin, if you want to use Java instead, check out the [Java Template](https://github.com/Weave-MC/ExampleMod).

> [!NOTE]  
> If you prefer developing in Java instead of Kotlin, check out the Java template repository at [Weave-MC/ExampleMod](https://github.com/Weave-MC/ExampleMod).

## How to start?

To use this repository as a template, click on the green **Use this template** button. 

Alternatively, you can simply clone this repository with the following commands:
```bash
# You can change "MyCoolMod" to anything you'd like
git clone https://github.com/Weave-MC/ExampleMod-Kotlin MyCoolMod 
cd MyCoolMod
```

## How to build

Building requires a JDK of version 17 or higher. A good JDK distribution can be downloaded from [Adoptium.net](https://adoptium.net/temurin/releases?version=17&os=any&arch=any), but any OpenJDK compatible JDK suffices.

To build a Weave mod, you can simply run:

```bash
./gradlew build
```

You can find the built jar files in `./build/libs/*.jar`.
