plugins{
    id("my-kotlin-convention")
}

dependencies{
    implementation(libs.ktor.client.core)
    implementation("com.example.worker:worker:1.0.0")
}

group = "com.example.mylib"
version = "1.0.0"
