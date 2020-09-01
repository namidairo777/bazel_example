# load our Spring Boot rule
load("//tools/springboot:springboot.bzl", "springboot",)

# create our deps list for Spring Boot, we have some convenience targets for this
springboot_deps = [
  "//tools/springboot/import_bundles:springboot_required_deps",
  "//tools/springboot/import_bundles:springboot_jetty_starter_deps",
  "//tools/springboot/import_bundles:springboot_web_starter_deps",
]

# this Java library contains your service code
java_library(
    name = 'helloworld_lib',
    srcs = glob(["src/main/java/**/*.java"]),
    resources = glob(["src/main/resources/**"]),
    deps = springboot_deps,
)

# use the springboot rule to build the app as a Spring Boot executable jar
springboot(
    name = "helloworld",
    boot_app_class = "com.sample.SampleMain",
    java_library = ":helloworld_lib",
    deps = springboot_deps,
)
