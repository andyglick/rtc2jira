/*
 * Copyright (c) 2015 BISON Schweiz AG, All Rights Reserved.
 */
package to.rtc.rtc2jira.storage;


/**
 * A list of all field names used in rtc2jira
 * 
 * @author roman.schaller
 *
 */
public interface FieldNames {
  String ID = "ID"; // DONE
  String SUMMARY = "summary"; // DONE
  String DESCRIPTION = "description"; // DONE
  String WORK_ITEM_TYPE = "workItemType"; // DONE
  String ACCEPTANCE_CRITERIAS = "acceptanceCriterias"; // DONE: custom field
  String MODIFIED = "modified"; // IGNORE = updated (can't be PUT)
  String CREATIONDATE = "creationDate"; // DONE (custom field)
  String COMMENTS = "internalComments"; // DONE
  String PRIORITY = "priority"; // DONE
  String SEVERITY = "severity"; // DONE
  String OWNER = "owner"; // DONE = assignee
  String CREATOR = "creator"; // DONE = reporter
  String MODIFIED_BY = "modifiedBy"; // no match. ignore
  String RESOLVER = "resolver"; // DONE custom field
  String RESOLUTION = "resolution"; // DONE (rtc 1=Fixed, 2=Duplicate/Rejected, 3=WorksAsDesigned,
                                    // 4=WorksForMe,
                                    // 5=Invalid)
  String RESOLUTION_DATE = "resolutionDate"; // TODO = resolutiondate (can't be PUT)
  String CATEGORY = "category"; // DONE
  String ARCHIVED = "archived"; // DONE
  String PROJECT_AREA = "projectArea";
  String STORY_POINTS = "storyPoints"; // DONE
  String CUSTOM_ATTRIBUTES = "customAttributes";
  String STATE = "state"; // DONE
  String TAGS = "tags"; // DONE
  String ITERATION_LABEL = "iterationLabel";
  String DUE_DATE = "dueDate"; // DONE
  String SUBSCRIPTIONS = "subscriptions"; // DONE
  String GITHUB_WORKITEM_LINK = "githubissuenumber";
  String JIRA_ID_LINK = "jiraid";
  String JIRA_KEY_LINK = "jiraKey";
  String JIRA_EXPORT_TIMESTAMP = "jiraExportTimestamp";
  String JIRA_LAST_EXPORTED_STATUS = "lastExportedStatus";

}
