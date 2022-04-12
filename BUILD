package(default_visibility = ["//visibility:public"])

java_library(
  name = "scanlib",
  srcs = glob(["src/**/*.java", "src/*.java"]),
  deps = [
    "@duckutil//:duckutil_lib",
    "@maven//:net_minidev_json_smart",
    "@maven//:com_google_guava_guava",
  ],
)

java_binary(
  name = "DriveScan",
  main_class = "DriveScan",
  runtime_deps = [
    ":scanlib",
  ],
)

