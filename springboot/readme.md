# springbootでREST_APIを作成する手順。

0. Eclipse インストール
  01. もろもろプラグインをインストール。
1. ファイル->新規->プロジェクト
  * 新規プロジェクトで、Gradle->Gradeleプロジェクト
  * gradleラッパーを選択しておく。（開発環境をよそにもっていくときに便利）
  * プロジェクト名を入力すると、デフォルトロケーションにフォルダを作ってくれる。
  * package名は、最終的にユニークであればOK。ひとまず適当にpracticeとかつけておく。
2.gradle.buildを編集する。
  * まずは、依存性を追加する。
    参照するするライブラリをdependenciesに追加する。
    手軽にやろうと思うなら、https://spring.io/guides/gs/rest-service/ あたりを参考にする。
  
