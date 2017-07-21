(defproject org.clojars.mike706574/postgresql-json "0.0.4"
  :description "Integration with PostgresSQL multiple types"
  :url "https://github.com/siscia/postgres-type"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha16"]
                 [org.clojure/java.jdbc "0.7.0"]
                 [org.postgresql/postgresql "9.4-1201-jdbc41"]]
  :profiles {:dev {:dependencies [[cheshire "5.7.1"]]}})
