# REST-API サンプル。

雛形の作成は[SPRING INITIALIZR](https://start.spring.io/)で作る。  
0. Generate a 「Gradle project」とする。  
1. GroupとArtifactを適当に決める。  
1. Search for dependenciesに…  
  12. Webと入力し、Selected Dependencies に「Web」が出るようにする。  
  13. 以下、同様にH2、JPA、Lombokを入れる。  
2. Generate Projectをクリックし、zipファイルをダウンロードする。  
3. zipファイルの中に、最低限のフォルダ構成と依存関係が記述されたgradle.buildが格納されている。  
