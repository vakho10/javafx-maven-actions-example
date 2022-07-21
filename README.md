# JavaFX Maven Actions Example
This is a demo project with Github actions and Github packages.

## How to Use
Access this package by specifying dependency tag:

```xml
<dependency>
    <groupId>ge.vakho</groupId>
    <artifactId>javafx-maven-actions-example</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency> 
```

Also, don't forget to additionally specify repository with PAT (Personal Access Token): 
`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`
```xml
<repositories>
    <repository>
        <id>github</id>
        <name>GitHub Packages</name>
        <url>https://public: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@maven.pkg.github.com/vakho10/*</url>
    </repository>
</repositories>
```

## Used Links
* https://medium.com/nerd-for-tech/maven-with-github-actions-and-packages-a-ci-read-b968173b018f
* https://github.community/t/how-to-make-github-packages-to-the-public/171321