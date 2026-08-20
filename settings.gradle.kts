rootProject.name = "my-composite-umbrella"

// 配下にある独立したビルド（世界）をすべて登録する
includeBuild("app-build")
includeBuild("lib-build")
includeBuild("build-logic")
includeBuild("worker")