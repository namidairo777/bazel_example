# Simple commands

```
bazel build //src/main/java/com/xiao/generator:generator-lib

bazel build //src/main/java/com/xiao:hello-world
bazel run //src/main/java/com/xiao:hello-world

# Junit Test 
bazel build //src/test/java/com/xiao/generatorjunit4:generator-junit4-test
bazel run //src/test/java/com/xiao/generatorjunit4:generator-junit4-test
bazel build //src/test/java/com/xiao/generator:generator-test
bazel run //src/test/java/com/xiao/generator:generator-test

# java doc
bazel build //:api-docs
```
