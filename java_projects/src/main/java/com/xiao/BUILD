# Builds executable jar file
java_binary(
    name = "hello-world",
    # source file, uses wildcard.
    srcs = glob(["**/*.java"]),
    main_class = "com.xiao.HelloWorld",
    deps = [
        # package name : target name
        "//src/main/java/com/xiao/generator:generator-lib",
#        "@maven//:com_linecorp_armeria_armeria",
#        "@maven//:com_linecorp_armeria_armeria_spring_boot2_autoconfigure",
#        "@maven//:org_springframework_boot_spring_boot",
#        "@maven//:org_springframework_boot_spring_boot_starter_web",
#        "@maven//:org_springframework_boot_spring_boot_autoconfigure"
    ],
)

