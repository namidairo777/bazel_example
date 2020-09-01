# Compile source code into Non-executable jar, this is no main class.
java_library(
    # target name
    name = "generator-lib",
    # source file, this one is a single java file.
    srcs = ["Generator.java"],
    # __pkg__ means visible to all rules in that package.
    visibility = [
        "//src/main/java/com/xiao:__pkg__",
        "//src/test/java/com/xiao/generator:__pkg__",
        "//src/test/java/com/xiao/generatorjunit4:__pkg__"
    ],
    # dependencies
    deps = [
        "@maven//:com_google_guava_guava"
    ],
)
