# 手順

1. Virtualboxをインストールすること。
2. vagrantをインストールすること。
3. vagrantでitameプラグインをインストールすること。
https://github.com/chiastolite/vagrant-itamae
```
> vagrant plugin install vagrant-itamae
```
4. vagrant up
5. itamaeでrecipeが動く。resipeの結果を反映するために、
  vagrant reloadをする。
6. GUIモードで起動するので、ライセンスの設定をしてやる。


## vagrant up が失敗する場合

以下のようなメッセージが出る場合があり。
```
Failed to mount folders in Linux guest. This is usually because
the "vboxsf" file system is not available. Please verify that
the guest additions are properly installed in the guest and
can work properly. The command attempted was:

mount -t vboxsf -o uid=`id -u vagrant`,gid=`getent group vagrant | cut -d: -f3` vagrant /vagrant
mount -t vboxsf -o uid=`id -u vagrant`,gid=`id -g vagrant` vagrant /vagrant

The error output from the last command was:

/sbin/mount.vboxsf: mounting failed with the error: No such device
```

Vagrant up は失敗しているが、VM自体は起動している。
この場合は、元々のboxファイルにバンドルされているGuest additionsのバージョンがあっていないので、共有フォルダの同期に失敗している。
以下プラグインを導入すること。さすれば、自動的に適当なバージョンを入れてくれる。

```
> vagrant plugin install vagrant-vbguest
```
