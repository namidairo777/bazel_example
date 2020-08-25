load("//macros:junit5.bzl", "java_junit5_test")

java_junit5_test(
    name = "generator-test",
    srcs = ["GeneratorTest.java"],
    test_package = "com.xiao.generator.GeneratorTest",
    # visibility = ["//src/main/java/com/xiao:__pkg__"],
    deps = [
        "//src/main/java/com/xiao/generator:generator-lib",
    ],
)
