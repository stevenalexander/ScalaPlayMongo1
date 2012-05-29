ScalaPlayMongo1
===============

Test application using Scala, Play and Mongo

Requires:
- Scala
- Play
- Mongo
- Intellij

Initial Setup

1. Create Repo in GitHub
2. Create new Play application - "play new ScalaPlayMongo"
3. In ScalaPlayMongo dir - "git init" to initialise local git
4. Add play files - "git add ."
5. Commit local, "git commit -m 'init'"
6. Set remote git repo, "git remote add origin git@github.com:username/ScalaPlayMongo.git"
7. Pull remote, "git pull origin master"
8. Push remote, "git push -u origin master"

Dev in Intellij

1. Generate Intellij project module, "play idea"
2. Open Intel
	1. Create new project from scratch
	2. Name "ScalaPlayMongo", .idea, uncheck "create module"
	3. In Project Structure, add Module
	4. import existing module "scalaplaymongo.iml"
3. Add *.iml to gitignore, edit with "sudo open -t .gitignore"
