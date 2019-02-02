# A Brief Git Explanation

Git is a decentralized Version Control System (VCS) which can be used to backup and manage large projects with numerous contributors.

A repository, or repo, is the collection of folders and files which are tracked as part of a project.

A commit is a change, or collection of changes, that have been made to the
repository. By looking at the commit history of a project, developers can learn
what changes were made when, by who, and why.  Commits can easily be reverted if changes are later found to have errors.

# Installing Git

To use git you will need to first install it from [here](https://git-scm.com/downloads).

After installing git there should be an option in the right click menu to "Git Bash Here".  This will open the Command Line Interface (CLI) at your current folder.

    git config --global user.name "\<name\>"
    git config --global user.email "\<email\>"

These git config commands will allow you to define the name and email that will be recorded as the author for each commit

    git clone <repo>

Replacing \<repo\> with the address for your repo (ending with .git) will copy the repo from GitHub (or wherever it's being hosted) onto your local machine.  This will copy both the files and a record of the past commits to the repository.

    cd <Directory>

The 'cd' function will change the current working directory of the CLI to the specified subdirectory.  To change to the parent directory of your current working directory substitute '..' for the \<Directory\> field

    git pull

The pull command will merge any changes made to the remote repo with your local repo.  If any changes were made to the local repo you may need to resolve merge conflicts.

    git add .

The add command will stage all changes that have been made to the repo.  This is the first step in committing your changes.

    git commit -m "<message>"

The commit command writes your changes to the repo, along with the specified commit message.  A commit message should explain ALL changes made by the commit.

    git push

The push command copies the changes that have been made to your local copy of the repo to the remote repo that you originally cloned from (usually GitHub).  If changes have been made since you last pulled/cloned you will need to resolve the merge conflicts.

To remove a branch, run the following commands.  This will tag the branch as being archived, then remove it.
    
    git tag archive/<branch_name> <branch_name>
    git checkout master
    git branch -D <branch_name>

To restore the branch run

    git checkout archive<branch_name>
    git branch -b <branch_name>

# More Information

For more information you can review the [Java Programming Guide](https://docs.google.com/presentation/d/1sSDVGMIaUvd3fiOjg9cdvbgQqJr7okUbFaYOy3HcV6s/edit?usp=sharing).

Alternatively, Atlassian has an excellent [Git Cheat Sheet](https://www.atlassian.com/dam/jcr:8132028b-024f-4b6b-953e-e68fcce0c5fa/atlassian-git-cheatsheet.pdf) with brief explanations of git commands.

For a more in-depth explanation of git, consider reading through the [About section of the git-scm website](https://git-scm.com/about)



