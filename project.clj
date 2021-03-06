(defproject leadpipe "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.1.6"]
                 [hiccup "1.0.5"]
                 [ring-server "0.3.1"]
                 [liberator "0.12.2"]
                 [cheshire "5.4.0"]
                 [clojurewerkz/neocons "3.0.0"]]

  :plugins [[lein-ring "0.8.12"]]
  :ring {:handler leadpipe.handler/app
         :init leadpipe.handler/init
         :destroy leadpipe.handler/destroy}
  :profiles
  {:uberjar {:aot :all}
   :production
   {:ring
    {:open-browser? false, :stacktraces? false, :auto-reload? false}}
   :dev
   {:dependencies [[ring-mock "0.1.5"] [ring/ring-devel "1.3.1"]]}})
