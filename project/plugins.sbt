addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.5.1")

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.9.1")

addSbtPlugin("com.typesafe.sbt" % "sbt-proguard" % "0.2.2")

scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature", "-language:_")
