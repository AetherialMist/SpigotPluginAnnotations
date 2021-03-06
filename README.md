# Spigot plugin.yml Annotations

_Inspired by Spigot plugin-annotations_

[![](https://jitpack.io/v/AetherialMist/SpigotPluginAnnotations.svg)](https://jitpack.io/#AetherialMist/SpigotPluginAnnotations)

The Spigot team create annotations to programmatically generate the `plugin.yml` file required for Minecraft Plugins.

Honestly I had some personal reservations about the structure of the `plugin-annotations` project, and believed I could
do better. And in my opinion, I did. There were some annotations that were not configured correctly, and the processor
was a mess.

Since I did use their codebase as a starting point to understand what annotations they provided and how they were being
processed, I have included their MIT code license in this module.

The Spigot team's source code can be found here: https://hub.spigotmc.org/stash/projects/SPIGOT/repos/plugin-annotations/browse

## How to include in your project

Add the following to your POM

```xml
<project>
    <repositories>
        <!--
        Pull GitHub releases as a dependency
        Website: https://jitpack.io/
        -->
        <repository>
            <id>jitpack.io</id>
            <url>https://jitpack.io</url>
        </repository>
    </repositories>
    
    <dependencies>
        <!--
        Spigot plugin.yml Annotations
        GitHub: https://github.com/AetherialMist/SpigotPluginAnnotations
        -->
        <dependency>
            <groupId>com.github.AetherialMist</groupId>
            <artifactId>SpigotPluginAnnotations</artifactId>
            <version>RELEASE_VERSION</version>
        </dependency>
    </dependencies>
</project>
```