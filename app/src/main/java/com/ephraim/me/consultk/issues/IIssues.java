package com.ephraim.me.consultk.issues;

import com.ephraim.me.consultk.models.Issue;
import com.ephraim.me.consultk.models.Project;

import java.util.ArrayList;


/**
 * Created by User on 4/16/2018.
 */

public interface IIssues {

    void showProgressBar();

    void hideProgressBar();

    void buildSnackbar(String message);

    void getProjects();

    void deleteIssuesFromProject(ArrayList<Issue> issues, Project project);
}
