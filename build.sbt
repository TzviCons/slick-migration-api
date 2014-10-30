crossScalaVersions := Seq("2.11.2", "2.10.4")

organization := "io.github.nafg"

name := "slick-migration-api"

instrumentSettings

CoverallsPlugin.coverallsSettings

parallelExecution in Test := false

parallelExecution in ScoverageTest := false

libraryDependencies += "com.typesafe.slick" %% "slick"                % "2.1.0-RC3"

libraryDependencies += "com.typesafe.slick" %% "slick-testkit"        % "2.1.0-RC3"     % "test"

libraryDependencies += "org.scalatest"      %% "scalatest"            % "2.2.0"         % "test"

libraryDependencies += "com.h2database"      % "h2"                   % "1.3.170"       % "test"

libraryDependencies += "org.xerial"          % "sqlite-jdbc"          % "3.7.2"         % "test"

libraryDependencies += "org.apache.derby"    % "derby"                % "10.10.1.1"     % "test"

libraryDependencies += "org.hsqldb"          % "hsqldb"               % "2.2.8"         % "test"

libraryDependencies += "postgresql"          % "postgresql"           % "9.1-901.jdbc4" % "test"

libraryDependencies += "mysql"               % "mysql-connector-java" % "5.1.31"        % "test"

libraryDependencies += "org.slf4j" % "slf4j-simple" % "1.5.6" % "test"


scalacOptions in (Compile, doc) ++= Seq("-groups", "-implicits")
