#!/bin/sh
if [[ "$1" == "" ]]; then
	echo "Usage : ./add_commit_push 'Commit Message'"
	exit 2
else 
	git add .  && git commit -m "$1" && git push https://$USERNAME:$PASSWORD@github.com/codeWriter9/competition.git master
	
	echo "Done"
	exit 0
fi
