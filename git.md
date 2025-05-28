git remote remove origin
dont forget to commit before pushing

command to branch
git checkout -b signup-feature//only makes it locally
git push -u origin signup-feature//pushes it to git hub
what if you didnt use -u?
Git will push the branch to GitHub, but it won't remember which remote branch to track for future operations.

To push or pull again, you'd need to specify the branch explicitly,

git branch//command to show the current branch by an asterix next to it

git branch//to check the current branch

git add .
git commit -m ""
git push -u origin 'branch name'