# REST-API サンプル。

SpringBootを使ったREST-APIのサンプル。
作業用ディレクトリを作成して移動したのち、`git clone`を実行する。
```
> mkdir c:¥work
> cd c:¥work
> git clone https://github.com/snjxnksm/practice.git
```


# ひな形作成

springbootでは、Ruby On Railsにおけるscaffoldに当たる機能がない。
そのため、最初の雛形の作成は[SPRING INITIALIZR](https://start.spring.io/)で作る。  

0. Generate a 「Gradle project」とする。  
1. GroupとArtifactを適当に決める。  
1. Search for dependenciesに…  
  12. Webと入力し、Selected Dependencies に「Web」が出るようにする。  
  13. 以下、同様にH2、JPA、Lombokを入れる。  
2. Generate Projectをクリックし、zipファイルをダウンロードする。  
3. zipファイルの中に、最低限のフォルダ構成と依存関係が記述されたgradle.buildが格納されている。  

## 関連するキーワード

* spring-boot
* gradle
* REST
* lombok
