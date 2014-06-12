(defproject cider-nrepl-exception "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.1.8"]]
  :plugins [[cider/cider-nrepl "0.7.0-SNAPSHOT"]]
  :repl-options {:nrepl-middleware [cider.nrepl.middleware.classpath/wrap-classpath
                                    cider.nrepl.middleware.complete/wrap-complete
                                    cider.nrepl.middleware.info/wrap-info
                                    cider.nrepl.middleware.inspect/wrap-inspect
                                    cider.nrepl.middleware.stacktrace/wrap-stacktrace
                                    cider.nrepl.middleware.trace/wrap-trace]}
  :immutant {:nrepl-port 4245})
