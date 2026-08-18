plugins{
    kotlin("jvm") version "2.0.0"
    application
}

repositories{
    mavenCentral()
}

application{
    mainClass.set("MainKt")
}

dependencies{
    implementation(project(":core"))
    // group名:どのモジュールか:version
    implementation("com.example.mylib:common:1.0.0")
}