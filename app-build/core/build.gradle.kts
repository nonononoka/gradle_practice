plugins{
    id("my-kotlin-convention")
}

dependencies{
    implementation("com.example.mylib:utils:1.0.0")
    implementation(libs.kotlinx.coroutines.core)
    implementation(project(":core2"))
}