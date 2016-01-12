# centos 7 にて、開発環境を作りたい。

execute 'yum update' do
  command 'sudo yum update -y'
end

# yum でGUIを整える
execute "yum GUI" do
  # windowシステム
  command 'sudo yum -y groupinstall "Server with GUI"'
end

# メニュー編集追加
execute "alacarte install " do
  command 'sudo yum -y install alacarte'
end

# 日本標準時の設定
execute "JST settings" do
  command 'sudo timedatectl set-timezone Asia/Tokyo'
end

# 日本語環境設定
execute "japanese settings" do
  # 文字セット変更
  command 'sudo localectl set-locale LANG=ja_JP.UTF-8'
  # runlevel 変更
  command 'sudo systemctl set-default graphical.target'
end

# ruby インストール
%w(ruby ruby-devel).each do |p|
    package p
end

# java インストール
package "java-1.8.0-openjdk"
package "java-1.8.0-openjdk-devel"

# git インストール
package "git"

# 開発ツールインストール
execute "install development tools" do
  command "sudo yum -y groupinstall 'Development Tools'"
end

# eclipse インストール
# execute "eclipse install mars" do
#  command "tar xvzf /vagrant_data/eclipse/eclipse-jee-mars-1-linux-gtk-x86_64.tar.gz -p /opt/eclipse/eclipse45"
#  command "ln -s /opt/eclipse/eclipse45/eclipse /usr/bin/eclipse"
#  command "cp /vagrant_data/eclipse/eclipse45.desktop /usr/share/applications/"
# end
