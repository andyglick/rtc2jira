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
  String ACCEPTANCE_CRITERIAS = "acceptanceCriterias"; // TODO: custom field (or description)
  String MODIFIED = "modified"; // TODO = updated (can't be PUT)
  String CREATIONDATE = "creationDate"; // NOT POSSIBLE
  String COMMENTS = "internalComments"; // DONE
  String PRIORITY = "priority";
  String SEVERITY = "severity";
  String OWNER = "owner"; // TODO: custom field?
  String CREATOR = "creator"; // DONE = reporter
  String MODIFIED_BY = "modifiedBy"; // no match. ignore
  String RESOLVER = "resolver"; // TODO? custom field
  String RESOLUTION = "resolution"; // DONE (rtc 1=Fixed, 2=Duplicate/Rejected, 3=WorksAsDesigned,
                                    // 4=WorksForMe,
                                    // 5=Invalid)
  String RESOLUTION_DATE = "resolutionDate"; // TODO = resolutiondate (can't be PUT)
  String CATEGORY = "category";
  String ARCHIVED = "archived";
  String PROJECT_AREA = "projectArea";
  String STORY_POINTS = "storyPoints";
  String CUSTOM_ATTRIBUTES = "customAttributes";
  String STATE = "state";
  String TAGS = "tags";
  String ITERATION_LABEL = "iterationLabel";
  String GITHUB_WORKITEM_LINK = "githubissuenumber";
  String JIRA_ID_LINK = "jiraid";
  String JIRA_KEY_LINK = "jiraKey";
  String JIRA_EXPORT_TIMESTAMP = "jiraExportTimestamp";
  String JIRA_LAST_EXPORTED_STATUS = "lastExportedStatus";
  String DUE_DATE = "dueDate"; // DONE
  String SUBSCRIPTIONS = "subscriptions";

}
