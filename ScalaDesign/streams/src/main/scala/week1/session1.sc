

val x : String => String = {case "ping" => "pong"}


val y: PartialFunction[String,String] = {case "ping" => "pong"}

x("ping")
y.isDefinedAt("ping")
y.isDefinedAt("abc")