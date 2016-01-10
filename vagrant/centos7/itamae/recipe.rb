# execute 'yum update' do
#   command 'sudo yum update -y'
# end

# ruby インストール
%w(ruby ruby-devel).each do |p|
    package p
end

# yum でGUIを整える
execute "yum GUI" do
  # windowシステム
  command 'sudo yum -y groupinstall "Server with GUI"'
end

# 日本語環境設定
execute "japanese settings" do
  # 文字セット変更
  command 'sudo localectl set-locale LANG=ja_JP.UTF-8'
  # runlevel 変更
  command 'sudo systemctl set-default graphical.target'
end
