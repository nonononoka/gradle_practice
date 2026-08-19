plugins{
    id("my-kotlin-convention")
    application
}

application{
    mainClass.set("MainKt")
}

dependencies{
    implementation(project(":core"))
    // group名:どのモジュールか:version
    implementation("com.example.mylib:common:1.0.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.1")
    implementation("io.ktor:ktor-client-core:2.3.0")
}