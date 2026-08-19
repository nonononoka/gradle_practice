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
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.ktor.client.core)
}