/*
 * (C) Copyright IBM Corp. 2020.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.cloud.schematics.v1;

import com.ibm.cloud.schematics.v1.Schematics;
import com.ibm.cloud.schematics.v1.model.Action;
import com.ibm.cloud.schematics.v1.model.ActionList;
import com.ibm.cloud.schematics.v1.model.ActionLite;
import com.ibm.cloud.schematics.v1.model.ActionLiteState;
import com.ibm.cloud.schematics.v1.model.ActionState;
import com.ibm.cloud.schematics.v1.model.ApplyWorkspaceCommandOptions;
import com.ibm.cloud.schematics.v1.model.CatalogRef;
import com.ibm.cloud.schematics.v1.model.CreateActionOptions;
import com.ibm.cloud.schematics.v1.model.CreateJobOptions;
import com.ibm.cloud.schematics.v1.model.CreateSharedDatasetOptions;
import com.ibm.cloud.schematics.v1.model.CreateWorkspaceDeletionJobOptions;
import com.ibm.cloud.schematics.v1.model.CreateWorkspaceOptions;
import com.ibm.cloud.schematics.v1.model.DeleteActionOptions;
import com.ibm.cloud.schematics.v1.model.DeleteJobOptions;
import com.ibm.cloud.schematics.v1.model.DeleteSharedDatasetOptions;
import com.ibm.cloud.schematics.v1.model.DeleteWorkspaceActivityOptions;
import com.ibm.cloud.schematics.v1.model.DeleteWorkspaceOptions;
import com.ibm.cloud.schematics.v1.model.DestroyWorkspaceCommandOptions;
import com.ibm.cloud.schematics.v1.model.EnvVariableResponse;
import com.ibm.cloud.schematics.v1.model.ExternalSource;
import com.ibm.cloud.schematics.v1.model.ExternalSourceGit;
import com.ibm.cloud.schematics.v1.model.GetActionOptions;
import com.ibm.cloud.schematics.v1.model.GetAllWorkspaceInputsOptions;
import com.ibm.cloud.schematics.v1.model.GetDiscoveredKmsInstancesOptions;
import com.ibm.cloud.schematics.v1.model.GetJobOptions;
import com.ibm.cloud.schematics.v1.model.GetKmsSettingsOptions;
import com.ibm.cloud.schematics.v1.model.GetSchematicsVersionOptions;
import com.ibm.cloud.schematics.v1.model.GetSharedDatasetOptions;
import com.ibm.cloud.schematics.v1.model.GetTemplateActivityLogOptions;
import com.ibm.cloud.schematics.v1.model.GetTemplateLogsOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceActivityLogsOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceActivityOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceDeletionJobStatusOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceInputMetadataOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceInputsOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceLogUrlsOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceOutputsOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceReadmeOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceResourcesOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceStateOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceTemplateStateOptions;
import com.ibm.cloud.schematics.v1.model.Job;
import com.ibm.cloud.schematics.v1.model.JobData;
import com.ibm.cloud.schematics.v1.model.JobDataAction;
import com.ibm.cloud.schematics.v1.model.JobList;
import com.ibm.cloud.schematics.v1.model.JobLite;
import com.ibm.cloud.schematics.v1.model.JobLog;
import com.ibm.cloud.schematics.v1.model.JobLogSummary;
import com.ibm.cloud.schematics.v1.model.JobLogSummaryActionJob;
import com.ibm.cloud.schematics.v1.model.JobLogSummaryActionJobRecap;
import com.ibm.cloud.schematics.v1.model.JobLogSummaryLogErrorsItem;
import com.ibm.cloud.schematics.v1.model.JobLogSummaryRepoDownloadJob;
import com.ibm.cloud.schematics.v1.model.JobStateData;
import com.ibm.cloud.schematics.v1.model.JobStateDataSummaryItem;
import com.ibm.cloud.schematics.v1.model.JobStatus;
import com.ibm.cloud.schematics.v1.model.JobStatusAction;
import com.ibm.cloud.schematics.v1.model.JobStatusType;
import com.ibm.cloud.schematics.v1.model.KMSDiscovery;
import com.ibm.cloud.schematics.v1.model.KMSInstances;
import com.ibm.cloud.schematics.v1.model.KMSInstancesKeysItem;
import com.ibm.cloud.schematics.v1.model.KMSSettings;
import com.ibm.cloud.schematics.v1.model.KMSSettingsPrimaryCrk;
import com.ibm.cloud.schematics.v1.model.KMSSettingsSecondaryCrk;
import com.ibm.cloud.schematics.v1.model.ListActionsOptions;
import com.ibm.cloud.schematics.v1.model.ListJobLogsOptions;
import com.ibm.cloud.schematics.v1.model.ListJobStatesOptions;
import com.ibm.cloud.schematics.v1.model.ListJobsOptions;
import com.ibm.cloud.schematics.v1.model.ListResourceGroupOptions;
import com.ibm.cloud.schematics.v1.model.ListSchematicsLocationOptions;
import com.ibm.cloud.schematics.v1.model.ListSharedDatasetsOptions;
import com.ibm.cloud.schematics.v1.model.ListWorkspaceActivitiesOptions;
import com.ibm.cloud.schematics.v1.model.ListWorkspacesOptions;
import com.ibm.cloud.schematics.v1.model.LogStoreResponse;
import com.ibm.cloud.schematics.v1.model.LogStoreResponseList;
import com.ibm.cloud.schematics.v1.model.LogSummary;
import com.ibm.cloud.schematics.v1.model.OutputValuesItem;
import com.ibm.cloud.schematics.v1.model.PlanWorkspaceCommandOptions;
import com.ibm.cloud.schematics.v1.model.RefreshWorkspaceCommandOptions;
import com.ibm.cloud.schematics.v1.model.ReplaceJobOptions;
import com.ibm.cloud.schematics.v1.model.ReplaceKmsSettingsOptions;
import com.ibm.cloud.schematics.v1.model.ReplaceSharedDatasetOptions;
import com.ibm.cloud.schematics.v1.model.ReplaceWorkspaceInputsOptions;
import com.ibm.cloud.schematics.v1.model.ReplaceWorkspaceOptions;
import com.ibm.cloud.schematics.v1.model.ResourceGroupResponse;
import com.ibm.cloud.schematics.v1.model.SchematicsLocations;
import com.ibm.cloud.schematics.v1.model.SharedDatasetData;
import com.ibm.cloud.schematics.v1.model.SharedDatasetResponse;
import com.ibm.cloud.schematics.v1.model.SharedDatasetResponseList;
import com.ibm.cloud.schematics.v1.model.SharedTargetData;
import com.ibm.cloud.schematics.v1.model.SharedTargetDataResponse;
import com.ibm.cloud.schematics.v1.model.StateStoreResponse;
import com.ibm.cloud.schematics.v1.model.StateStoreResponseList;
import com.ibm.cloud.schematics.v1.model.SystemLock;
import com.ibm.cloud.schematics.v1.model.TargetResourceset;
import com.ibm.cloud.schematics.v1.model.TemplateReadme;
import com.ibm.cloud.schematics.v1.model.TemplateRepoRequest;
import com.ibm.cloud.schematics.v1.model.TemplateRepoResponse;
import com.ibm.cloud.schematics.v1.model.TemplateRepoTarUploadResponse;
import com.ibm.cloud.schematics.v1.model.TemplateRepoUpdateRequest;
import com.ibm.cloud.schematics.v1.model.TemplateResources;
import com.ibm.cloud.schematics.v1.model.TemplateRunTimeDataResponse;
import com.ibm.cloud.schematics.v1.model.TemplateSourceDataRequest;
import com.ibm.cloud.schematics.v1.model.TemplateSourceDataResponse;
import com.ibm.cloud.schematics.v1.model.TemplateStateStore;
import com.ibm.cloud.schematics.v1.model.TemplateValues;
import com.ibm.cloud.schematics.v1.model.UpdateActionOptions;
import com.ibm.cloud.schematics.v1.model.UpdateWorkspaceOptions;
import com.ibm.cloud.schematics.v1.model.UploadTemplateTarOptions;
import com.ibm.cloud.schematics.v1.model.UserState;
import com.ibm.cloud.schematics.v1.model.UserValues;
import com.ibm.cloud.schematics.v1.model.VariableData;
import com.ibm.cloud.schematics.v1.model.VariableMetadata;
import com.ibm.cloud.schematics.v1.model.VersionResponse;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivities;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivity;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivityApplyResult;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivityDestroyResult;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivityLogs;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivityOptionsTemplate;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivityPlanResult;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivityRefreshResult;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivityTemplate;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivityTemplateLogs;
import com.ibm.cloud.schematics.v1.model.WorkspaceBulkDeleteResponse;
import com.ibm.cloud.schematics.v1.model.WorkspaceJobResponse;
import com.ibm.cloud.schematics.v1.model.WorkspaceResponse;
import com.ibm.cloud.schematics.v1.model.WorkspaceResponseList;
import com.ibm.cloud.schematics.v1.model.WorkspaceStatusMessage;
import com.ibm.cloud.schematics.v1.model.WorkspaceStatusRequest;
import com.ibm.cloud.schematics.v1.model.WorkspaceStatusResponse;
import com.ibm.cloud.schematics.v1.model.WorkspaceStatusUpdateRequest;
import com.ibm.cloud.schematics.v1.model.WorkspaceTemplateValuesResponse;
import com.ibm.cloud.schematics.v1.model.WorkspaceVariableRequest;
import com.ibm.cloud.schematics.v1.model.WorkspaceVariableResponse;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.EnvironmentUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.testng.PowerMockTestCase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the Schematics service.
 */
@PrepareForTest({ EnvironmentUtils.class })
@PowerMockIgnore({"javax.net.ssl.*", "org.mockito.*"})
public class SchematicsTest extends PowerMockTestCase {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected Schematics schematicsService;

  // Creates a mock set of environment variables that are returned by EnvironmentUtils.getenv().
  private Map<String, String> getTestProcessEnvironment() {
    Map<String, String> env = new HashMap<>();
    env.put("TESTSERVICE_AUTH_TYPE", "noAuth");
    return env;
  }

  public void constructClientService() throws Throwable {
    PowerMockito.spy(EnvironmentUtils.class);
    PowerMockito.when(EnvironmentUtils.getenv()).thenReturn(getTestProcessEnvironment());
    final String serviceName = "testService";

    schematicsService = Schematics.newInstance(serviceName);
    String url = server.url("/").toString();
    schematicsService.setServiceUrl(url);
  }

  /**
  * Negative Test - construct the service with a null authenticator.
  */
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";

    new Schematics(serviceName, null);
  }

  @Test
  public void testListSchematicsLocationWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "[{\"country\": \"country\", \"geography\": \"geography\", \"id\": \"id\", \"kind\": \"kind\", \"metro\": \"metro\", \"multizone_metro\": \"multizoneMetro\", \"name\": \"name\"}]";
    String listSchematicsLocationPath = "/v1/locations";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListSchematicsLocationOptions model
    ListSchematicsLocationOptions listSchematicsLocationOptionsModel = new ListSchematicsLocationOptions();

    // Invoke operation with valid options model (positive test)
    Response<List<SchematicsLocations>> response = schematicsService.listSchematicsLocation(listSchematicsLocationOptionsModel).execute();
    assertNotNull(response);
    List<SchematicsLocations> responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listSchematicsLocationPath);
  }

  @Test
  public void testListResourceGroupWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "[{\"account_id\": \"accountId\", \"crn\": \"crn\", \"default\": true, \"name\": \"name\", \"resource_group_id\": \"resourceGroupId\", \"state\": \"state\"}]";
    String listResourceGroupPath = "/v1/resource_groups";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListResourceGroupOptions model
    ListResourceGroupOptions listResourceGroupOptionsModel = new ListResourceGroupOptions();

    // Invoke operation with valid options model (positive test)
    Response<List<ResourceGroupResponse>> response = schematicsService.listResourceGroup(listResourceGroupOptionsModel).execute();
    assertNotNull(response);
    List<ResourceGroupResponse> responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listResourceGroupPath);
  }

  @Test
  public void testGetSchematicsVersionWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"builddate\": \"builddate\", \"buildno\": \"buildno\", \"commitsha\": \"commitsha\", \"helm_provider_version\": \"helmProviderVersion\", \"helm_version\": \"helmVersion\", \"supported_template_types\": [\"anyValue\"], \"terraform_provider_version\": \"terraformProviderVersion\", \"terraform_version\": \"terraformVersion\"}";
    String getSchematicsVersionPath = "/v1/version";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetSchematicsVersionOptions model
    GetSchematicsVersionOptions getSchematicsVersionOptionsModel = new GetSchematicsVersionOptions();

    // Invoke operation with valid options model (positive test)
    Response<VersionResponse> response = schematicsService.getSchematicsVersion(getSchematicsVersionOptionsModel).execute();
    assertNotNull(response);
    VersionResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSchematicsVersionPath);
  }

  @Test
  public void testListWorkspacesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"count\": 5, \"limit\": 5, \"offset\": 6, \"workspaces\": [{\"applied_shareddata_ids\": [\"appliedShareddataIds\"], \"catalog_ref\": {\"dry_run\": true, \"item_icon_url\": \"itemIconUrl\", \"item_id\": \"itemId\", \"item_name\": \"itemName\", \"item_readme_url\": \"itemReadmeUrl\", \"item_url\": \"itemUrl\", \"launch_url\": \"launchUrl\", \"offering_version\": \"offeringVersion\"}, \"created_at\": \"2019-01-01T12:00:00\", \"created_by\": \"createdBy\", \"crn\": \"crn\", \"description\": \"description\", \"id\": \"id\", \"last_health_check_at\": \"2019-01-01T12:00:00\", \"location\": \"location\", \"name\": \"name\", \"resource_group\": \"resourceGroup\", \"runtime_data\": [{\"engine_cmd\": \"engineCmd\", \"engine_name\": \"engineName\", \"engine_version\": \"engineVersion\", \"id\": \"id\", \"log_store_url\": \"logStoreUrl\", \"output_values\": [\"anyValue\"], \"resources\": [[\"anyValue\"]], \"state_store_url\": \"stateStoreUrl\"}], \"shared_data\": {\"cluster_id\": \"clusterId\", \"cluster_name\": \"clusterName\", \"entitlement_keys\": [\"anyValue\"], \"namespace\": \"namespace\", \"region\": \"region\", \"resource_group_id\": \"resourceGroupId\"}, \"status\": \"status\", \"tags\": [\"tags\"], \"template_data\": [{\"env_values\": [{\"hidden\": true, \"name\": \"name\", \"secure\": true, \"value\": \"value\"}], \"folder\": \"folder\", \"has_githubtoken\": true, \"id\": \"id\", \"template_type\": \"templateType\", \"uninstall_script_name\": \"uninstallScriptName\", \"values\": \"values\", \"values_metadata\": [\"anyValue\"], \"values_url\": \"valuesUrl\", \"variablestore\": [{\"description\": \"description\", \"name\": \"name\", \"secure\": true, \"type\": \"type\", \"value\": \"value\"}]}], \"template_ref\": \"templateRef\", \"template_repo\": {\"branch\": \"branch\", \"full_url\": \"fullUrl\", \"has_uploadedgitrepotar\": false, \"release\": \"release\", \"repo_sha_value\": \"repoShaValue\", \"repo_url\": \"repoUrl\", \"url\": \"url\"}, \"type\": [\"type\"], \"updated_at\": \"2019-01-01T12:00:00\", \"updated_by\": \"updatedBy\", \"workspace_status\": {\"frozen\": true, \"frozen_at\": \"2019-01-01T12:00:00\", \"frozen_by\": \"frozenBy\", \"locked\": true, \"locked_by\": \"lockedBy\", \"locked_time\": \"2019-01-01T12:00:00\"}, \"workspace_status_msg\": {\"status_code\": \"statusCode\", \"status_msg\": \"statusMsg\"}}]}";
    String listWorkspacesPath = "/v1/workspaces";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListWorkspacesOptions model
    ListWorkspacesOptions listWorkspacesOptionsModel = new ListWorkspacesOptions.Builder()
    .offset(Long.valueOf("0"))
    .limit(Long.valueOf("1"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<WorkspaceResponseList> response = schematicsService.listWorkspaces(listWorkspacesOptionsModel).execute();
    assertNotNull(response);
    WorkspaceResponseList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listWorkspacesPath);
  }

  @Test
  public void testCreateWorkspaceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"applied_shareddata_ids\": [\"appliedShareddataIds\"], \"catalog_ref\": {\"dry_run\": true, \"item_icon_url\": \"itemIconUrl\", \"item_id\": \"itemId\", \"item_name\": \"itemName\", \"item_readme_url\": \"itemReadmeUrl\", \"item_url\": \"itemUrl\", \"launch_url\": \"launchUrl\", \"offering_version\": \"offeringVersion\"}, \"created_at\": \"2019-01-01T12:00:00\", \"created_by\": \"createdBy\", \"crn\": \"crn\", \"description\": \"description\", \"id\": \"id\", \"last_health_check_at\": \"2019-01-01T12:00:00\", \"location\": \"location\", \"name\": \"name\", \"resource_group\": \"resourceGroup\", \"runtime_data\": [{\"engine_cmd\": \"engineCmd\", \"engine_name\": \"engineName\", \"engine_version\": \"engineVersion\", \"id\": \"id\", \"log_store_url\": \"logStoreUrl\", \"output_values\": [\"anyValue\"], \"resources\": [[\"anyValue\"]], \"state_store_url\": \"stateStoreUrl\"}], \"shared_data\": {\"cluster_id\": \"clusterId\", \"cluster_name\": \"clusterName\", \"entitlement_keys\": [\"anyValue\"], \"namespace\": \"namespace\", \"region\": \"region\", \"resource_group_id\": \"resourceGroupId\"}, \"status\": \"status\", \"tags\": [\"tags\"], \"template_data\": [{\"env_values\": [{\"hidden\": true, \"name\": \"name\", \"secure\": true, \"value\": \"value\"}], \"folder\": \"folder\", \"has_githubtoken\": true, \"id\": \"id\", \"template_type\": \"templateType\", \"uninstall_script_name\": \"uninstallScriptName\", \"values\": \"values\", \"values_metadata\": [\"anyValue\"], \"values_url\": \"valuesUrl\", \"variablestore\": [{\"description\": \"description\", \"name\": \"name\", \"secure\": true, \"type\": \"type\", \"value\": \"value\"}]}], \"template_ref\": \"templateRef\", \"template_repo\": {\"branch\": \"branch\", \"full_url\": \"fullUrl\", \"has_uploadedgitrepotar\": false, \"release\": \"release\", \"repo_sha_value\": \"repoShaValue\", \"repo_url\": \"repoUrl\", \"url\": \"url\"}, \"type\": [\"type\"], \"updated_at\": \"2019-01-01T12:00:00\", \"updated_by\": \"updatedBy\", \"workspace_status\": {\"frozen\": true, \"frozen_at\": \"2019-01-01T12:00:00\", \"frozen_by\": \"frozenBy\", \"locked\": true, \"locked_by\": \"lockedBy\", \"locked_time\": \"2019-01-01T12:00:00\"}, \"workspace_status_msg\": {\"status_code\": \"statusCode\", \"status_msg\": \"statusMsg\"}}";
    String createWorkspacePath = "/v1/workspaces";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the CatalogRef model
    CatalogRef catalogRefModel = new CatalogRef.Builder()
    .dryRun(true)
    .itemIconUrl("testString")
    .itemId("testString")
    .itemName("testString")
    .itemReadmeUrl("testString")
    .itemUrl("testString")
    .launchUrl("testString")
    .offeringVersion("testString")
    .build();

    // Construct an instance of the SharedTargetData model
    SharedTargetData sharedTargetDataModel = new SharedTargetData.Builder()
    .clusterCreatedOn("testString")
    .clusterId("testString")
    .clusterName("testString")
    .clusterType("testString")
    .entitlementKeys(new java.util.ArrayList<Object>(java.util.Arrays.asList("testString")))
    .namespace("testString")
    .region("testString")
    .resourceGroupId("testString")
    .workerCount(Long.valueOf("26"))
    .workerMachineType("testString")
    .build();

    // Construct an instance of the WorkspaceVariableRequest model
    WorkspaceVariableRequest workspaceVariableRequestModel = new WorkspaceVariableRequest.Builder()
    .description("testString")
    .name("testString")
    .secure(true)
    .type("testString")
    .useDefault(true)
    .value("testString")
    .build();

    // Construct an instance of the TemplateSourceDataRequest model
    TemplateSourceDataRequest templateSourceDataRequestModel = new TemplateSourceDataRequest.Builder()
    .envValues(new java.util.ArrayList<Object>(java.util.Arrays.asList("testString")))
    .folder("testString")
    .initStateFile("testString")
    .type("testString")
    .uninstallScriptName("testString")
    .values("testString")
    .valuesMetadata(new java.util.ArrayList<Object>(java.util.Arrays.asList("testString")))
    .variablestore(new java.util.ArrayList<WorkspaceVariableRequest>(java.util.Arrays.asList(workspaceVariableRequestModel)))
    .build();

    // Construct an instance of the TemplateRepoRequest model
    TemplateRepoRequest templateRepoRequestModel = new TemplateRepoRequest.Builder()
    .branch("testString")
    .release("testString")
    .repoShaValue("testString")
    .repoUrl("testString")
    .url("testString")
    .build();

    // Construct an instance of the WorkspaceStatusRequest model
    WorkspaceStatusRequest workspaceStatusRequestModel = new WorkspaceStatusRequest.Builder()
    .frozen(true)
    .frozenAt(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
    .frozenBy("testString")
    .locked(true)
    .lockedBy("testString")
    .lockedTime(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
    .build();

    // Construct an instance of the CreateWorkspaceOptions model
    CreateWorkspaceOptions createWorkspaceOptionsModel = new CreateWorkspaceOptions.Builder()
    .appliedShareddataIds(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .catalogRef(catalogRefModel)
    .description("testString")
    .location("testString")
    .name("testString")
    .resourceGroup("testString")
    .sharedData(sharedTargetDataModel)
    .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .templateData(new java.util.ArrayList<TemplateSourceDataRequest>(java.util.Arrays.asList(templateSourceDataRequestModel)))
    .templateRef("testString")
    .templateRepo(templateRepoRequestModel)
    .type(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .workspaceStatus(workspaceStatusRequestModel)
    .xGithubToken("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<WorkspaceResponse> response = schematicsService.createWorkspace(createWorkspaceOptionsModel).execute();
    assertNotNull(response);
    WorkspaceResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createWorkspacePath);
  }

  @Test
  public void testGetWorkspaceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"applied_shareddata_ids\": [\"appliedShareddataIds\"], \"catalog_ref\": {\"dry_run\": true, \"item_icon_url\": \"itemIconUrl\", \"item_id\": \"itemId\", \"item_name\": \"itemName\", \"item_readme_url\": \"itemReadmeUrl\", \"item_url\": \"itemUrl\", \"launch_url\": \"launchUrl\", \"offering_version\": \"offeringVersion\"}, \"created_at\": \"2019-01-01T12:00:00\", \"created_by\": \"createdBy\", \"crn\": \"crn\", \"description\": \"description\", \"id\": \"id\", \"last_health_check_at\": \"2019-01-01T12:00:00\", \"location\": \"location\", \"name\": \"name\", \"resource_group\": \"resourceGroup\", \"runtime_data\": [{\"engine_cmd\": \"engineCmd\", \"engine_name\": \"engineName\", \"engine_version\": \"engineVersion\", \"id\": \"id\", \"log_store_url\": \"logStoreUrl\", \"output_values\": [\"anyValue\"], \"resources\": [[\"anyValue\"]], \"state_store_url\": \"stateStoreUrl\"}], \"shared_data\": {\"cluster_id\": \"clusterId\", \"cluster_name\": \"clusterName\", \"entitlement_keys\": [\"anyValue\"], \"namespace\": \"namespace\", \"region\": \"region\", \"resource_group_id\": \"resourceGroupId\"}, \"status\": \"status\", \"tags\": [\"tags\"], \"template_data\": [{\"env_values\": [{\"hidden\": true, \"name\": \"name\", \"secure\": true, \"value\": \"value\"}], \"folder\": \"folder\", \"has_githubtoken\": true, \"id\": \"id\", \"template_type\": \"templateType\", \"uninstall_script_name\": \"uninstallScriptName\", \"values\": \"values\", \"values_metadata\": [\"anyValue\"], \"values_url\": \"valuesUrl\", \"variablestore\": [{\"description\": \"description\", \"name\": \"name\", \"secure\": true, \"type\": \"type\", \"value\": \"value\"}]}], \"template_ref\": \"templateRef\", \"template_repo\": {\"branch\": \"branch\", \"full_url\": \"fullUrl\", \"has_uploadedgitrepotar\": false, \"release\": \"release\", \"repo_sha_value\": \"repoShaValue\", \"repo_url\": \"repoUrl\", \"url\": \"url\"}, \"type\": [\"type\"], \"updated_at\": \"2019-01-01T12:00:00\", \"updated_by\": \"updatedBy\", \"workspace_status\": {\"frozen\": true, \"frozen_at\": \"2019-01-01T12:00:00\", \"frozen_by\": \"frozenBy\", \"locked\": true, \"locked_by\": \"lockedBy\", \"locked_time\": \"2019-01-01T12:00:00\"}, \"workspace_status_msg\": {\"status_code\": \"statusCode\", \"status_msg\": \"statusMsg\"}}";
    String getWorkspacePath = "/v1/workspaces/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetWorkspaceOptions model
    GetWorkspaceOptions getWorkspaceOptionsModel = new GetWorkspaceOptions.Builder()
    .wId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<WorkspaceResponse> response = schematicsService.getWorkspace(getWorkspaceOptionsModel).execute();
    assertNotNull(response);
    WorkspaceResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getWorkspacePath);
  }

  // Test the getWorkspace operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetWorkspaceNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematicsService.getWorkspace(null).execute();
  }

  @Test
  public void testReplaceWorkspaceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"applied_shareddata_ids\": [\"appliedShareddataIds\"], \"catalog_ref\": {\"dry_run\": true, \"item_icon_url\": \"itemIconUrl\", \"item_id\": \"itemId\", \"item_name\": \"itemName\", \"item_readme_url\": \"itemReadmeUrl\", \"item_url\": \"itemUrl\", \"launch_url\": \"launchUrl\", \"offering_version\": \"offeringVersion\"}, \"created_at\": \"2019-01-01T12:00:00\", \"created_by\": \"createdBy\", \"crn\": \"crn\", \"description\": \"description\", \"id\": \"id\", \"last_health_check_at\": \"2019-01-01T12:00:00\", \"location\": \"location\", \"name\": \"name\", \"resource_group\": \"resourceGroup\", \"runtime_data\": [{\"engine_cmd\": \"engineCmd\", \"engine_name\": \"engineName\", \"engine_version\": \"engineVersion\", \"id\": \"id\", \"log_store_url\": \"logStoreUrl\", \"output_values\": [\"anyValue\"], \"resources\": [[\"anyValue\"]], \"state_store_url\": \"stateStoreUrl\"}], \"shared_data\": {\"cluster_id\": \"clusterId\", \"cluster_name\": \"clusterName\", \"entitlement_keys\": [\"anyValue\"], \"namespace\": \"namespace\", \"region\": \"region\", \"resource_group_id\": \"resourceGroupId\"}, \"status\": \"status\", \"tags\": [\"tags\"], \"template_data\": [{\"env_values\": [{\"hidden\": true, \"name\": \"name\", \"secure\": true, \"value\": \"value\"}], \"folder\": \"folder\", \"has_githubtoken\": true, \"id\": \"id\", \"template_type\": \"templateType\", \"uninstall_script_name\": \"uninstallScriptName\", \"values\": \"values\", \"values_metadata\": [\"anyValue\"], \"values_url\": \"valuesUrl\", \"variablestore\": [{\"description\": \"description\", \"name\": \"name\", \"secure\": true, \"type\": \"type\", \"value\": \"value\"}]}], \"template_ref\": \"templateRef\", \"template_repo\": {\"branch\": \"branch\", \"full_url\": \"fullUrl\", \"has_uploadedgitrepotar\": false, \"release\": \"release\", \"repo_sha_value\": \"repoShaValue\", \"repo_url\": \"repoUrl\", \"url\": \"url\"}, \"type\": [\"type\"], \"updated_at\": \"2019-01-01T12:00:00\", \"updated_by\": \"updatedBy\", \"workspace_status\": {\"frozen\": true, \"frozen_at\": \"2019-01-01T12:00:00\", \"frozen_by\": \"frozenBy\", \"locked\": true, \"locked_by\": \"lockedBy\", \"locked_time\": \"2019-01-01T12:00:00\"}, \"workspace_status_msg\": {\"status_code\": \"statusCode\", \"status_msg\": \"statusMsg\"}}";
    String replaceWorkspacePath = "/v1/workspaces/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the CatalogRef model
    CatalogRef catalogRefModel = new CatalogRef.Builder()
    .dryRun(true)
    .itemIconUrl("testString")
    .itemId("testString")
    .itemName("testString")
    .itemReadmeUrl("testString")
    .itemUrl("testString")
    .launchUrl("testString")
    .offeringVersion("testString")
    .build();

    // Construct an instance of the SharedTargetData model
    SharedTargetData sharedTargetDataModel = new SharedTargetData.Builder()
    .clusterCreatedOn("testString")
    .clusterId("testString")
    .clusterName("testString")
    .clusterType("testString")
    .entitlementKeys(new java.util.ArrayList<Object>(java.util.Arrays.asList("testString")))
    .namespace("testString")
    .region("testString")
    .resourceGroupId("testString")
    .workerCount(Long.valueOf("26"))
    .workerMachineType("testString")
    .build();

    // Construct an instance of the WorkspaceVariableRequest model
    WorkspaceVariableRequest workspaceVariableRequestModel = new WorkspaceVariableRequest.Builder()
    .description("testString")
    .name("testString")
    .secure(true)
    .type("testString")
    .useDefault(true)
    .value("testString")
    .build();

    // Construct an instance of the TemplateSourceDataRequest model
    TemplateSourceDataRequest templateSourceDataRequestModel = new TemplateSourceDataRequest.Builder()
    .envValues(new java.util.ArrayList<Object>(java.util.Arrays.asList("testString")))
    .folder("testString")
    .initStateFile("testString")
    .type("testString")
    .uninstallScriptName("testString")
    .values("testString")
    .valuesMetadata(new java.util.ArrayList<Object>(java.util.Arrays.asList("testString")))
    .variablestore(new java.util.ArrayList<WorkspaceVariableRequest>(java.util.Arrays.asList(workspaceVariableRequestModel)))
    .build();

    // Construct an instance of the TemplateRepoUpdateRequest model
    TemplateRepoUpdateRequest templateRepoUpdateRequestModel = new TemplateRepoUpdateRequest.Builder()
    .branch("testString")
    .release("testString")
    .repoShaValue("testString")
    .repoUrl("testString")
    .url("testString")
    .build();

    // Construct an instance of the WorkspaceStatusUpdateRequest model
    WorkspaceStatusUpdateRequest workspaceStatusUpdateRequestModel = new WorkspaceStatusUpdateRequest.Builder()
    .frozen(true)
    .frozenAt(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
    .frozenBy("testString")
    .locked(true)
    .lockedBy("testString")
    .lockedTime(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
    .build();

    // Construct an instance of the WorkspaceStatusMessage model
    WorkspaceStatusMessage workspaceStatusMessageModel = new WorkspaceStatusMessage.Builder()
    .statusCode("testString")
    .statusMsg("testString")
    .build();

    // Construct an instance of the ReplaceWorkspaceOptions model
    ReplaceWorkspaceOptions replaceWorkspaceOptionsModel = new ReplaceWorkspaceOptions.Builder()
    .wId("testString")
    .catalogRef(catalogRefModel)
    .description("testString")
    .name("testString")
    .sharedData(sharedTargetDataModel)
    .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .templateData(new java.util.ArrayList<TemplateSourceDataRequest>(java.util.Arrays.asList(templateSourceDataRequestModel)))
    .templateRepo(templateRepoUpdateRequestModel)
    .type(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .workspaceStatus(workspaceStatusUpdateRequestModel)
    .workspaceStatusMsg(workspaceStatusMessageModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<WorkspaceResponse> response = schematicsService.replaceWorkspace(replaceWorkspaceOptionsModel).execute();
    assertNotNull(response);
    WorkspaceResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceWorkspacePath);
  }

  // Test the replaceWorkspace operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceWorkspaceNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematicsService.replaceWorkspace(null).execute();
  }

  @Test
  public void testDeleteWorkspaceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "\"operationResponse\"";
    String deleteWorkspacePath = "/v1/workspaces/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteWorkspaceOptions model
    DeleteWorkspaceOptions deleteWorkspaceOptionsModel = new DeleteWorkspaceOptions.Builder()
    .wId("testString")
    .refreshToken("testString")
    .destroyResources("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<String> response = schematicsService.deleteWorkspace(deleteWorkspaceOptionsModel).execute();
    assertNotNull(response);
    String responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    assertEquals(request.getHeader("Refresh_token"), "testString");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("destroy_resources"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteWorkspacePath);
  }

  // Test the deleteWorkspace operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteWorkspaceNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematicsService.deleteWorkspace(null).execute();
  }

  @Test
  public void testUpdateWorkspaceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"applied_shareddata_ids\": [\"appliedShareddataIds\"], \"catalog_ref\": {\"dry_run\": true, \"item_icon_url\": \"itemIconUrl\", \"item_id\": \"itemId\", \"item_name\": \"itemName\", \"item_readme_url\": \"itemReadmeUrl\", \"item_url\": \"itemUrl\", \"launch_url\": \"launchUrl\", \"offering_version\": \"offeringVersion\"}, \"created_at\": \"2019-01-01T12:00:00\", \"created_by\": \"createdBy\", \"crn\": \"crn\", \"description\": \"description\", \"id\": \"id\", \"last_health_check_at\": \"2019-01-01T12:00:00\", \"location\": \"location\", \"name\": \"name\", \"resource_group\": \"resourceGroup\", \"runtime_data\": [{\"engine_cmd\": \"engineCmd\", \"engine_name\": \"engineName\", \"engine_version\": \"engineVersion\", \"id\": \"id\", \"log_store_url\": \"logStoreUrl\", \"output_values\": [\"anyValue\"], \"resources\": [[\"anyValue\"]], \"state_store_url\": \"stateStoreUrl\"}], \"shared_data\": {\"cluster_id\": \"clusterId\", \"cluster_name\": \"clusterName\", \"entitlement_keys\": [\"anyValue\"], \"namespace\": \"namespace\", \"region\": \"region\", \"resource_group_id\": \"resourceGroupId\"}, \"status\": \"status\", \"tags\": [\"tags\"], \"template_data\": [{\"env_values\": [{\"hidden\": true, \"name\": \"name\", \"secure\": true, \"value\": \"value\"}], \"folder\": \"folder\", \"has_githubtoken\": true, \"id\": \"id\", \"template_type\": \"templateType\", \"uninstall_script_name\": \"uninstallScriptName\", \"values\": \"values\", \"values_metadata\": [\"anyValue\"], \"values_url\": \"valuesUrl\", \"variablestore\": [{\"description\": \"description\", \"name\": \"name\", \"secure\": true, \"type\": \"type\", \"value\": \"value\"}]}], \"template_ref\": \"templateRef\", \"template_repo\": {\"branch\": \"branch\", \"full_url\": \"fullUrl\", \"has_uploadedgitrepotar\": false, \"release\": \"release\", \"repo_sha_value\": \"repoShaValue\", \"repo_url\": \"repoUrl\", \"url\": \"url\"}, \"type\": [\"type\"], \"updated_at\": \"2019-01-01T12:00:00\", \"updated_by\": \"updatedBy\", \"workspace_status\": {\"frozen\": true, \"frozen_at\": \"2019-01-01T12:00:00\", \"frozen_by\": \"frozenBy\", \"locked\": true, \"locked_by\": \"lockedBy\", \"locked_time\": \"2019-01-01T12:00:00\"}, \"workspace_status_msg\": {\"status_code\": \"statusCode\", \"status_msg\": \"statusMsg\"}}";
    String updateWorkspacePath = "/v1/workspaces/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the CatalogRef model
    CatalogRef catalogRefModel = new CatalogRef.Builder()
    .dryRun(true)
    .itemIconUrl("testString")
    .itemId("testString")
    .itemName("testString")
    .itemReadmeUrl("testString")
    .itemUrl("testString")
    .launchUrl("testString")
    .offeringVersion("testString")
    .build();

    // Construct an instance of the SharedTargetData model
    SharedTargetData sharedTargetDataModel = new SharedTargetData.Builder()
    .clusterCreatedOn("testString")
    .clusterId("testString")
    .clusterName("testString")
    .clusterType("testString")
    .entitlementKeys(new java.util.ArrayList<Object>(java.util.Arrays.asList("testString")))
    .namespace("testString")
    .region("testString")
    .resourceGroupId("testString")
    .workerCount(Long.valueOf("26"))
    .workerMachineType("testString")
    .build();

    // Construct an instance of the WorkspaceVariableRequest model
    WorkspaceVariableRequest workspaceVariableRequestModel = new WorkspaceVariableRequest.Builder()
    .description("testString")
    .name("testString")
    .secure(true)
    .type("testString")
    .useDefault(true)
    .value("testString")
    .build();

    // Construct an instance of the TemplateSourceDataRequest model
    TemplateSourceDataRequest templateSourceDataRequestModel = new TemplateSourceDataRequest.Builder()
    .envValues(new java.util.ArrayList<Object>(java.util.Arrays.asList("testString")))
    .folder("testString")
    .initStateFile("testString")
    .type("testString")
    .uninstallScriptName("testString")
    .values("testString")
    .valuesMetadata(new java.util.ArrayList<Object>(java.util.Arrays.asList("testString")))
    .variablestore(new java.util.ArrayList<WorkspaceVariableRequest>(java.util.Arrays.asList(workspaceVariableRequestModel)))
    .build();

    // Construct an instance of the TemplateRepoUpdateRequest model
    TemplateRepoUpdateRequest templateRepoUpdateRequestModel = new TemplateRepoUpdateRequest.Builder()
    .branch("testString")
    .release("testString")
    .repoShaValue("testString")
    .repoUrl("testString")
    .url("testString")
    .build();

    // Construct an instance of the WorkspaceStatusUpdateRequest model
    WorkspaceStatusUpdateRequest workspaceStatusUpdateRequestModel = new WorkspaceStatusUpdateRequest.Builder()
    .frozen(true)
    .frozenAt(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
    .frozenBy("testString")
    .locked(true)
    .lockedBy("testString")
    .lockedTime(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
    .build();

    // Construct an instance of the WorkspaceStatusMessage model
    WorkspaceStatusMessage workspaceStatusMessageModel = new WorkspaceStatusMessage.Builder()
    .statusCode("testString")
    .statusMsg("testString")
    .build();

    // Construct an instance of the UpdateWorkspaceOptions model
    UpdateWorkspaceOptions updateWorkspaceOptionsModel = new UpdateWorkspaceOptions.Builder()
    .wId("testString")
    .catalogRef(catalogRefModel)
    .description("testString")
    .name("testString")
    .sharedData(sharedTargetDataModel)
    .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .templateData(new java.util.ArrayList<TemplateSourceDataRequest>(java.util.Arrays.asList(templateSourceDataRequestModel)))
    .templateRepo(templateRepoUpdateRequestModel)
    .type(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .workspaceStatus(workspaceStatusUpdateRequestModel)
    .workspaceStatusMsg(workspaceStatusMessageModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<WorkspaceResponse> response = schematicsService.updateWorkspace(updateWorkspaceOptionsModel).execute();
    assertNotNull(response);
    WorkspaceResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateWorkspacePath);
  }

  // Test the updateWorkspace operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateWorkspaceNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematicsService.updateWorkspace(null).execute();
  }

  @Test
  public void testUploadTemplateTarWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"file_value\": \"fileValue\", \"has_received_file\": false, \"id\": \"id\"}";
    String uploadTemplateTarPath = "/v1/workspaces/testString/template_data/testString/template_repo_upload";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UploadTemplateTarOptions model
    UploadTemplateTarOptions uploadTemplateTarOptionsModel = new UploadTemplateTarOptions.Builder()
    .wId("testString")
    .tId("testString")
    .file(TestUtilities.createMockStream("This is a mock file."))
    .fileContentType("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<TemplateRepoTarUploadResponse> response = schematicsService.uploadTemplateTar(uploadTemplateTarOptionsModel).execute();
    assertNotNull(response);
    TemplateRepoTarUploadResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, uploadTemplateTarPath);
  }

  // Test the uploadTemplateTar operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUploadTemplateTarNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematicsService.uploadTemplateTar(null).execute();
  }

  @Test
  public void testGetWorkspaceReadmeWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"readme\": \"readme\"}";
    String getWorkspaceReadmePath = "/v1/workspaces/testString/templates/readme";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetWorkspaceReadmeOptions model
    GetWorkspaceReadmeOptions getWorkspaceReadmeOptionsModel = new GetWorkspaceReadmeOptions.Builder()
    .wId("testString")
    .ref("testString")
    .formatted("markdown")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<TemplateReadme> response = schematicsService.getWorkspaceReadme(getWorkspaceReadmeOptionsModel).execute();
    assertNotNull(response);
    TemplateReadme responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("ref"), "testString");
    assertEquals(query.get("formatted"), "markdown");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getWorkspaceReadmePath);
  }

  // Test the getWorkspaceReadme operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetWorkspaceReadmeNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematicsService.getWorkspaceReadme(null).execute();
  }

  @Test
  public void testListWorkspaceActivitiesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"actions\": [{\"action_id\": \"actionId\", \"message\": [\"message\"], \"name\": \"name\", \"performed_at\": \"2019-01-01T12:00:00\", \"performed_by\": \"performedBy\", \"status\": \"status\", \"templates\": [{\"end_time\": \"2019-01-01T12:00:00\", \"log_summary\": {\"activity_status\": \"activityStatus\", \"detected_template_type\": \"detectedTemplateType\", \"discarded_files\": 14, \"error\": \"error\", \"resources_added\": 14, \"resources_destroyed\": 18, \"resources_modified\": 17, \"scanned_files\": 12, \"template_variable_count\": 21, \"time_taken\": 9}, \"log_url\": \"logUrl\", \"message\": \"message\", \"start_time\": \"2019-01-01T12:00:00\", \"status\": \"status\", \"template_id\": \"templateId\", \"template_type\": \"templateType\"}]}], \"workspace_id\": \"workspaceId\", \"workspace_name\": \"workspaceName\"}";
    String listWorkspaceActivitiesPath = "/v1/workspaces/testString/actions";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListWorkspaceActivitiesOptions model
    ListWorkspaceActivitiesOptions listWorkspaceActivitiesOptionsModel = new ListWorkspaceActivitiesOptions.Builder()
    .wId("testString")
    .offset(Long.valueOf("0"))
    .limit(Long.valueOf("1"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<WorkspaceActivities> response = schematicsService.listWorkspaceActivities(listWorkspaceActivitiesOptionsModel).execute();
    assertNotNull(response);
    WorkspaceActivities responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listWorkspaceActivitiesPath);
  }

  // Test the listWorkspaceActivities operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListWorkspaceActivitiesNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematicsService.listWorkspaceActivities(null).execute();
  }

  @Test
  public void testGetWorkspaceActivityWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"action_id\": \"actionId\", \"message\": [\"message\"], \"name\": \"name\", \"performed_at\": \"2019-01-01T12:00:00\", \"performed_by\": \"performedBy\", \"status\": \"status\", \"templates\": [{\"end_time\": \"2019-01-01T12:00:00\", \"log_summary\": {\"activity_status\": \"activityStatus\", \"detected_template_type\": \"detectedTemplateType\", \"discarded_files\": 14, \"error\": \"error\", \"resources_added\": 14, \"resources_destroyed\": 18, \"resources_modified\": 17, \"scanned_files\": 12, \"template_variable_count\": 21, \"time_taken\": 9}, \"log_url\": \"logUrl\", \"message\": \"message\", \"start_time\": \"2019-01-01T12:00:00\", \"status\": \"status\", \"template_id\": \"templateId\", \"template_type\": \"templateType\"}]}";
    String getWorkspaceActivityPath = "/v1/workspaces/testString/actions/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetWorkspaceActivityOptions model
    GetWorkspaceActivityOptions getWorkspaceActivityOptionsModel = new GetWorkspaceActivityOptions.Builder()
    .wId("testString")
    .activityId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<WorkspaceActivity> response = schematicsService.getWorkspaceActivity(getWorkspaceActivityOptionsModel).execute();
    assertNotNull(response);
    WorkspaceActivity responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getWorkspaceActivityPath);
  }

  // Test the getWorkspaceActivity operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetWorkspaceActivityNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematicsService.getWorkspaceActivity(null).execute();
  }

  @Test
  public void testDeleteWorkspaceActivityWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"activityid\": \"activityid\"}";
    String deleteWorkspaceActivityPath = "/v1/workspaces/testString/actions/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(202)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteWorkspaceActivityOptions model
    DeleteWorkspaceActivityOptions deleteWorkspaceActivityOptionsModel = new DeleteWorkspaceActivityOptions.Builder()
    .wId("testString")
    .activityId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<WorkspaceActivityApplyResult> response = schematicsService.deleteWorkspaceActivity(deleteWorkspaceActivityOptionsModel).execute();
    assertNotNull(response);
    WorkspaceActivityApplyResult responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteWorkspaceActivityPath);
  }

  // Test the deleteWorkspaceActivity operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteWorkspaceActivityNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematicsService.deleteWorkspaceActivity(null).execute();
  }

  @Test
  public void testApplyWorkspaceCommandWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"activityid\": \"activityid\"}";
    String applyWorkspaceCommandPath = "/v1/workspaces/testString/apply";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(202)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the WorkspaceActivityOptionsTemplate model
    WorkspaceActivityOptionsTemplate workspaceActivityOptionsTemplateModel = new WorkspaceActivityOptionsTemplate.Builder()
    .target(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .tfVars(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .build();

    // Construct an instance of the ApplyWorkspaceCommandOptions model
    ApplyWorkspaceCommandOptions applyWorkspaceCommandOptionsModel = new ApplyWorkspaceCommandOptions.Builder()
    .wId("testString")
    .refreshToken("testString")
    .actionOptions(workspaceActivityOptionsTemplateModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<WorkspaceActivityApplyResult> response = schematicsService.applyWorkspaceCommand(applyWorkspaceCommandOptionsModel).execute();
    assertNotNull(response);
    WorkspaceActivityApplyResult responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    assertEquals(request.getHeader("Refresh_token"), "testString");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, applyWorkspaceCommandPath);
  }

  // Test the applyWorkspaceCommand operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testApplyWorkspaceCommandNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematicsService.applyWorkspaceCommand(null).execute();
  }

  @Test
  public void testDestroyWorkspaceCommandWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"activityid\": \"activityid\"}";
    String destroyWorkspaceCommandPath = "/v1/workspaces/testString/destroy";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(202)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the WorkspaceActivityOptionsTemplate model
    WorkspaceActivityOptionsTemplate workspaceActivityOptionsTemplateModel = new WorkspaceActivityOptionsTemplate.Builder()
    .target(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .tfVars(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .build();

    // Construct an instance of the DestroyWorkspaceCommandOptions model
    DestroyWorkspaceCommandOptions destroyWorkspaceCommandOptionsModel = new DestroyWorkspaceCommandOptions.Builder()
    .wId("testString")
    .refreshToken("testString")
    .actionOptions(workspaceActivityOptionsTemplateModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<WorkspaceActivityDestroyResult> response = schematicsService.destroyWorkspaceCommand(destroyWorkspaceCommandOptionsModel).execute();
    assertNotNull(response);
    WorkspaceActivityDestroyResult responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    assertEquals(request.getHeader("Refresh_token"), "testString");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, destroyWorkspaceCommandPath);
  }

  // Test the destroyWorkspaceCommand operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDestroyWorkspaceCommandNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematicsService.destroyWorkspaceCommand(null).execute();
  }

  @Test
  public void testPlanWorkspaceCommandWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"activityid\": \"activityid\"}";
    String planWorkspaceCommandPath = "/v1/workspaces/testString/plan";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(202)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the PlanWorkspaceCommandOptions model
    PlanWorkspaceCommandOptions planWorkspaceCommandOptionsModel = new PlanWorkspaceCommandOptions.Builder()
    .wId("testString")
    .refreshToken("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<WorkspaceActivityPlanResult> response = schematicsService.planWorkspaceCommand(planWorkspaceCommandOptionsModel).execute();
    assertNotNull(response);
    WorkspaceActivityPlanResult responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    assertEquals(request.getHeader("Refresh_token"), "testString");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, planWorkspaceCommandPath);
  }

  // Test the planWorkspaceCommand operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPlanWorkspaceCommandNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematicsService.planWorkspaceCommand(null).execute();
  }

  @Test
  public void testRefreshWorkspaceCommandWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"activityid\": \"activityid\"}";
    String refreshWorkspaceCommandPath = "/v1/workspaces/testString/refresh";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(202)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the RefreshWorkspaceCommandOptions model
    RefreshWorkspaceCommandOptions refreshWorkspaceCommandOptionsModel = new RefreshWorkspaceCommandOptions.Builder()
    .wId("testString")
    .refreshToken("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<WorkspaceActivityRefreshResult> response = schematicsService.refreshWorkspaceCommand(refreshWorkspaceCommandOptionsModel).execute();
    assertNotNull(response);
    WorkspaceActivityRefreshResult responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    assertEquals(request.getHeader("Refresh_token"), "testString");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, refreshWorkspaceCommandPath);
  }

  // Test the refreshWorkspaceCommand operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRefreshWorkspaceCommandNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematicsService.refreshWorkspaceCommand(null).execute();
  }

  @Test
  public void testGetWorkspaceInputsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"values_metadata\": [\"anyValue\"]}";
    String getWorkspaceInputsPath = "/v1/workspaces/testString/template_data/testString/values";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetWorkspaceInputsOptions model
    GetWorkspaceInputsOptions getWorkspaceInputsOptionsModel = new GetWorkspaceInputsOptions.Builder()
    .wId("testString")
    .tId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<TemplateValues> response = schematicsService.getWorkspaceInputs(getWorkspaceInputsOptionsModel).execute();
    assertNotNull(response);
    TemplateValues responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getWorkspaceInputsPath);
  }

  // Test the getWorkspaceInputs operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetWorkspaceInputsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematicsService.getWorkspaceInputs(null).execute();
  }

  @Test
  public void testReplaceWorkspaceInputsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"env_values\": [\"anyValue\"], \"values\": \"values\", \"variablestore\": [{\"description\": \"description\", \"name\": \"name\", \"secure\": true, \"type\": \"type\", \"value\": \"value\"}]}";
    String replaceWorkspaceInputsPath = "/v1/workspaces/testString/template_data/testString/values";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the WorkspaceVariableRequest model
    WorkspaceVariableRequest workspaceVariableRequestModel = new WorkspaceVariableRequest.Builder()
    .description("testString")
    .name("testString")
    .secure(true)
    .type("testString")
    .useDefault(true)
    .value("testString")
    .build();

    // Construct an instance of the ReplaceWorkspaceInputsOptions model
    ReplaceWorkspaceInputsOptions replaceWorkspaceInputsOptionsModel = new ReplaceWorkspaceInputsOptions.Builder()
    .wId("testString")
    .tId("testString")
    .envValues(new java.util.ArrayList<Object>(java.util.Arrays.asList("testString")))
    .values("testString")
    .variablestore(new java.util.ArrayList<WorkspaceVariableRequest>(java.util.Arrays.asList(workspaceVariableRequestModel)))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<UserValues> response = schematicsService.replaceWorkspaceInputs(replaceWorkspaceInputsOptionsModel).execute();
    assertNotNull(response);
    UserValues responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceWorkspaceInputsPath);
  }

  // Test the replaceWorkspaceInputs operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceWorkspaceInputsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematicsService.replaceWorkspaceInputs(null).execute();
  }

  @Test
  public void testGetAllWorkspaceInputsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"runtime_data\": [{\"engine_cmd\": \"engineCmd\", \"engine_name\": \"engineName\", \"engine_version\": \"engineVersion\", \"id\": \"id\", \"log_store_url\": \"logStoreUrl\", \"output_values\": [\"anyValue\"], \"resources\": [[\"anyValue\"]], \"state_store_url\": \"stateStoreUrl\"}], \"shared_data\": {\"cluster_created_on\": \"clusterCreatedOn\", \"cluster_id\": \"clusterId\", \"cluster_name\": \"clusterName\", \"cluster_type\": \"clusterType\", \"entitlement_keys\": [\"anyValue\"], \"namespace\": \"namespace\", \"region\": \"region\", \"resource_group_id\": \"resourceGroupId\", \"worker_count\": 11, \"worker_machine_type\": \"workerMachineType\"}, \"template_data\": [{\"env_values\": [{\"hidden\": true, \"name\": \"name\", \"secure\": true, \"value\": \"value\"}], \"folder\": \"folder\", \"has_githubtoken\": true, \"id\": \"id\", \"template_type\": \"templateType\", \"uninstall_script_name\": \"uninstallScriptName\", \"values\": \"values\", \"values_metadata\": [\"anyValue\"], \"values_url\": \"valuesUrl\", \"variablestore\": [{\"description\": \"description\", \"name\": \"name\", \"secure\": true, \"type\": \"type\", \"value\": \"value\"}]}]}";
    String getAllWorkspaceInputsPath = "/v1/workspaces/testString/templates/values";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetAllWorkspaceInputsOptions model
    GetAllWorkspaceInputsOptions getAllWorkspaceInputsOptionsModel = new GetAllWorkspaceInputsOptions.Builder()
    .wId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<WorkspaceTemplateValuesResponse> response = schematicsService.getAllWorkspaceInputs(getAllWorkspaceInputsOptionsModel).execute();
    assertNotNull(response);
    WorkspaceTemplateValuesResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getAllWorkspaceInputsPath);
  }

  // Test the getAllWorkspaceInputs operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetAllWorkspaceInputsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematicsService.getAllWorkspaceInputs(null).execute();
  }

  @Test
  public void testGetWorkspaceInputMetadataWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "[\"anyValue\"]";
    String getWorkspaceInputMetadataPath = "/v1/workspaces/testString/template_data/testString/values_metadata";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetWorkspaceInputMetadataOptions model
    GetWorkspaceInputMetadataOptions getWorkspaceInputMetadataOptionsModel = new GetWorkspaceInputMetadataOptions.Builder()
    .wId("testString")
    .tId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<List<Object>> response = schematicsService.getWorkspaceInputMetadata(getWorkspaceInputMetadataOptionsModel).execute();
    assertNotNull(response);
    List<Object> responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getWorkspaceInputMetadataPath);
  }

  // Test the getWorkspaceInputMetadata operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetWorkspaceInputMetadataNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematicsService.getWorkspaceInputMetadata(null).execute();
  }

  @Test
  public void testGetWorkspaceOutputsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "[{\"folder\": \"folder\", \"id\": \"id\", \"output_values\": [\"anyValue\"], \"value_type\": \"valueType\"}]";
    String getWorkspaceOutputsPath = "/v1/workspaces/testString/output_values";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetWorkspaceOutputsOptions model
    GetWorkspaceOutputsOptions getWorkspaceOutputsOptionsModel = new GetWorkspaceOutputsOptions.Builder()
    .wId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<List<OutputValuesItem>> response = schematicsService.getWorkspaceOutputs(getWorkspaceOutputsOptionsModel).execute();
    assertNotNull(response);
    List<OutputValuesItem> responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getWorkspaceOutputsPath);
  }

  // Test the getWorkspaceOutputs operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetWorkspaceOutputsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematicsService.getWorkspaceOutputs(null).execute();
  }

  @Test
  public void testGetWorkspaceResourcesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "[{\"folder\": \"folder\", \"id\": \"id\", \"null_resources\": [\"anyValue\"], \"related_resources\": [\"anyValue\"], \"resources\": [\"anyValue\"], \"resources_count\": 14, \"template_type\": \"templateType\"}]";
    String getWorkspaceResourcesPath = "/v1/workspaces/testString/resources";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetWorkspaceResourcesOptions model
    GetWorkspaceResourcesOptions getWorkspaceResourcesOptionsModel = new GetWorkspaceResourcesOptions.Builder()
    .wId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<List<TemplateResources>> response = schematicsService.getWorkspaceResources(getWorkspaceResourcesOptionsModel).execute();
    assertNotNull(response);
    List<TemplateResources> responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getWorkspaceResourcesPath);
  }

  // Test the getWorkspaceResources operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetWorkspaceResourcesNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematicsService.getWorkspaceResources(null).execute();
  }

  @Test
  public void testGetWorkspaceStateWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"runtime_data\": [{\"engine_name\": \"engineName\", \"engine_version\": \"engineVersion\", \"id\": \"id\", \"state_store_url\": \"stateStoreUrl\"}]}";
    String getWorkspaceStatePath = "/v1/workspaces/testString/state_stores";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetWorkspaceStateOptions model
    GetWorkspaceStateOptions getWorkspaceStateOptionsModel = new GetWorkspaceStateOptions.Builder()
    .wId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<StateStoreResponseList> response = schematicsService.getWorkspaceState(getWorkspaceStateOptionsModel).execute();
    assertNotNull(response);
    StateStoreResponseList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getWorkspaceStatePath);
  }

  // Test the getWorkspaceState operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetWorkspaceStateNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematicsService.getWorkspaceState(null).execute();
  }

  @Test
  public void testGetWorkspaceTemplateStateWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"version\": 7, \"terraform_version\": \"terraformVersion\", \"serial\": 6, \"lineage\": \"lineage\", \"modules\": [\"anyValue\"]}";
    String getWorkspaceTemplateStatePath = "/v1/workspaces/testString/runtime_data/testString/state_store";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetWorkspaceTemplateStateOptions model
    GetWorkspaceTemplateStateOptions getWorkspaceTemplateStateOptionsModel = new GetWorkspaceTemplateStateOptions.Builder()
    .wId("testString")
    .tId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<TemplateStateStore> response = schematicsService.getWorkspaceTemplateState(getWorkspaceTemplateStateOptionsModel).execute();
    assertNotNull(response);
    TemplateStateStore responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getWorkspaceTemplateStatePath);
  }

  // Test the getWorkspaceTemplateState operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetWorkspaceTemplateStateNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematicsService.getWorkspaceTemplateState(null).execute();
  }

  @Test
  public void testGetWorkspaceActivityLogsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"action_id\": \"actionId\", \"name\": \"name\", \"templates\": [{\"log_url\": \"logUrl\", \"template_id\": \"templateId\", \"template_type\": \"templateType\"}]}";
    String getWorkspaceActivityLogsPath = "/v1/workspaces/testString/actions/testString/logs";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetWorkspaceActivityLogsOptions model
    GetWorkspaceActivityLogsOptions getWorkspaceActivityLogsOptionsModel = new GetWorkspaceActivityLogsOptions.Builder()
    .wId("testString")
    .activityId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<WorkspaceActivityLogs> response = schematicsService.getWorkspaceActivityLogs(getWorkspaceActivityLogsOptionsModel).execute();
    assertNotNull(response);
    WorkspaceActivityLogs responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getWorkspaceActivityLogsPath);
  }

  // Test the getWorkspaceActivityLogs operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetWorkspaceActivityLogsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematicsService.getWorkspaceActivityLogs(null).execute();
  }

  @Test
  public void testGetWorkspaceLogUrlsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"runtime_data\": [{\"engine_name\": \"engineName\", \"engine_version\": \"engineVersion\", \"id\": \"id\", \"log_store_url\": \"logStoreUrl\"}]}";
    String getWorkspaceLogUrlsPath = "/v1/workspaces/testString/log_stores";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetWorkspaceLogUrlsOptions model
    GetWorkspaceLogUrlsOptions getWorkspaceLogUrlsOptionsModel = new GetWorkspaceLogUrlsOptions.Builder()
    .wId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<LogStoreResponseList> response = schematicsService.getWorkspaceLogUrls(getWorkspaceLogUrlsOptionsModel).execute();
    assertNotNull(response);
    LogStoreResponseList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getWorkspaceLogUrlsPath);
  }

  // Test the getWorkspaceLogUrls operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetWorkspaceLogUrlsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematicsService.getWorkspaceLogUrls(null).execute();
  }

  @Test
  public void testGetTemplateLogsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "\"operationResponse\"";
    String getTemplateLogsPath = "/v1/workspaces/testString/runtime_data/testString/log_store";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetTemplateLogsOptions model
    GetTemplateLogsOptions getTemplateLogsOptionsModel = new GetTemplateLogsOptions.Builder()
    .wId("testString")
    .tId("testString")
    .logTfCmd(true)
    .logTfPrefix(true)
    .logTfNullResource(true)
    .logTfAnsible(true)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<String> response = schematicsService.getTemplateLogs(getTemplateLogsOptionsModel).execute();
    assertNotNull(response);
    String responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(Boolean.valueOf(query.get("log_tf_cmd")), Boolean.valueOf(true));
    assertEquals(Boolean.valueOf(query.get("log_tf_prefix")), Boolean.valueOf(true));
    assertEquals(Boolean.valueOf(query.get("log_tf_null_resource")), Boolean.valueOf(true));
    assertEquals(Boolean.valueOf(query.get("log_tf_ansible")), Boolean.valueOf(true));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getTemplateLogsPath);
  }

  // Test the getTemplateLogs operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetTemplateLogsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematicsService.getTemplateLogs(null).execute();
  }

  @Test
  public void testGetTemplateActivityLogWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "\"operationResponse\"";
    String getTemplateActivityLogPath = "/v1/workspaces/testString/runtime_data/testString/log_store/actions/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetTemplateActivityLogOptions model
    GetTemplateActivityLogOptions getTemplateActivityLogOptionsModel = new GetTemplateActivityLogOptions.Builder()
    .wId("testString")
    .tId("testString")
    .activityId("testString")
    .logTfCmd(true)
    .logTfPrefix(true)
    .logTfNullResource(true)
    .logTfAnsible(true)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<String> response = schematicsService.getTemplateActivityLog(getTemplateActivityLogOptionsModel).execute();
    assertNotNull(response);
    String responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(Boolean.valueOf(query.get("log_tf_cmd")), Boolean.valueOf(true));
    assertEquals(Boolean.valueOf(query.get("log_tf_prefix")), Boolean.valueOf(true));
    assertEquals(Boolean.valueOf(query.get("log_tf_null_resource")), Boolean.valueOf(true));
    assertEquals(Boolean.valueOf(query.get("log_tf_ansible")), Boolean.valueOf(true));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getTemplateActivityLogPath);
  }

  // Test the getTemplateActivityLog operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetTemplateActivityLogNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematicsService.getTemplateActivityLog(null).execute();
  }

  @Test
  public void testCreateWorkspaceDeletionJobWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"job\": \"job\", \"job_id\": \"jobId\"}";
    String createWorkspaceDeletionJobPath = "/v1/workspace_jobs";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the CreateWorkspaceDeletionJobOptions model
    CreateWorkspaceDeletionJobOptions createWorkspaceDeletionJobOptionsModel = new CreateWorkspaceDeletionJobOptions.Builder()
    .refreshToken("testString")
    .newDeleteWorkspaces(true)
    .newDestroyResources(true)
    .newJob("testString")
    .newVersion("testString")
    .newWorkspaces(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .destroyResources("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<WorkspaceBulkDeleteResponse> response = schematicsService.createWorkspaceDeletionJob(createWorkspaceDeletionJobOptionsModel).execute();
    assertNotNull(response);
    WorkspaceBulkDeleteResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    assertEquals(request.getHeader("Refresh_token"), "testString");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("destroy_resources"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createWorkspaceDeletionJobPath);
  }

  // Test the createWorkspaceDeletionJob operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateWorkspaceDeletionJobNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematicsService.createWorkspaceDeletionJob(null).execute();
  }

  @Test
  public void testGetWorkspaceDeletionJobStatusWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"job_status\": {\"failed\": [\"failed\"], \"in_progress\": [\"inProgress\"], \"success\": [\"success\"], \"last_updated_on\": \"2019-01-01T12:00:00\"}}";
    String getWorkspaceDeletionJobStatusPath = "/v1/workspace_jobs/testString/status";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetWorkspaceDeletionJobStatusOptions model
    GetWorkspaceDeletionJobStatusOptions getWorkspaceDeletionJobStatusOptionsModel = new GetWorkspaceDeletionJobStatusOptions.Builder()
    .wjId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<WorkspaceJobResponse> response = schematicsService.getWorkspaceDeletionJobStatus(getWorkspaceDeletionJobStatusOptionsModel).execute();
    assertNotNull(response);
    WorkspaceJobResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getWorkspaceDeletionJobStatusPath);
  }

  // Test the getWorkspaceDeletionJobStatus operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetWorkspaceDeletionJobStatusNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematicsService.getWorkspaceDeletionJobStatus(null).execute();
  }

  @Test
  public void testCreateActionWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"Stop Action\", \"description\": \"This Action can be used to Stop the targets\", \"location\": \"us_south\", \"resource_group\": \"resourceGroup\", \"tags\": [\"tags\"], \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00\"}, \"source_readme_url\": \"sourceReadmeUrl\", \"source\": {\"source_type\": \"local\", \"git\": {\"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}}, \"source_type\": \"local\", \"command_parameter\": \"commandParameter\", \"bastion\": {\"name\": \"name\", \"type\": \"type\", \"description\": \"description\", \"resource_query\": \"resourceQuery\", \"credential\": \"credential\", \"id\": \"id\", \"created_at\": \"2019-01-01T12:00:00\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00\", \"updated_by\": \"updatedBy\", \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00\"}, \"resource_ids\": [\"resourceIds\"]}, \"targets\": [{\"name\": \"name\", \"type\": \"type\", \"description\": \"description\", \"resource_query\": \"resourceQuery\", \"credential\": \"credential\", \"id\": \"id\", \"created_at\": \"2019-01-01T12:00:00\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00\", \"updated_by\": \"updatedBy\", \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00\"}, \"resource_ids\": [\"resourceIds\"]}], \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"trigger_record_id\": \"triggerRecordId\", \"id\": \"id\", \"crn\": \"crn\", \"account\": \"account\", \"source_created_at\": \"2019-01-01T12:00:00\", \"source_created_by\": \"sourceCreatedBy\", \"source_updated_at\": \"2019-01-01T12:00:00\", \"source_updated_by\": \"sourceUpdatedBy\", \"created_at\": \"2019-01-01T12:00:00\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00\", \"updated_by\": \"updatedBy\", \"namespace\": \"namespace\", \"state\": {\"status_code\": \"normal\", \"status_message\": \"statusMessage\"}, \"playbook_names\": [\"playbookNames\"], \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00\"}}";
    String createActionPath = "/v2/actions";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UserState model
    UserState userStateModel = new UserState.Builder()
    .state("draft")
    .setBy("testString")
    .setAt(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
    .build();

    // Construct an instance of the ExternalSourceGit model
    ExternalSourceGit externalSourceGitModel = new ExternalSourceGit.Builder()
    .gitRepoUrl("testString")
    .gitToken("testString")
    .gitRepoFolder("testString")
    .gitRelease("testString")
    .gitBranch("testString")
    .build();

    // Construct an instance of the ExternalSource model
    ExternalSource externalSourceModel = new ExternalSource.Builder()
    .sourceType("local")
    .git(externalSourceGitModel)
    .build();

    // Construct an instance of the SystemLock model
    SystemLock systemLockModel = new SystemLock.Builder()
    .sysLocked(true)
    .sysLockedBy("testString")
    .sysLockedAt(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
    .build();

    // Construct an instance of the TargetResourceset model
    TargetResourceset targetResourcesetModel = new TargetResourceset.Builder()
    .name("testString")
    .type("testString")
    .description("testString")
    .resourceQuery("testString")
    .credential("testString")
    .sysLock(systemLockModel)
    .build();

    // Construct an instance of the VariableMetadata model
    VariableMetadata variableMetadataModel = new VariableMetadata.Builder()
    .type("boolean")
    .aliases(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .description("testString")
    .defaultValue("testString")
    .secure(true)
    .immutable(true)
    .hidden(true)
    .options(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .minValue(Long.valueOf("26"))
    .maxValue(Long.valueOf("26"))
    .minLength(Long.valueOf("26"))
    .maxLength(Long.valueOf("26"))
    .matches("testString")
    .position(Long.valueOf("26"))
    .groupBy("testString")
    .source("testString")
    .build();

    // Construct an instance of the VariableData model
    VariableData variableDataModel = new VariableData.Builder()
    .name("testString")
    .value("testString")
    .metadata(variableMetadataModel)
    .build();

    // Construct an instance of the ActionState model
    ActionState actionStateModel = new ActionState.Builder()
    .statusCode("normal")
    .statusMessage("testString")
    .build();

    // Construct an instance of the CreateActionOptions model
    CreateActionOptions createActionOptionsModel = new CreateActionOptions.Builder()
    .name("Stop Action")
    .description("This Action can be used to Stop the targets")
    .location("us_south")
    .resourceGroup("testString")
    .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .userState(userStateModel)
    .sourceReadmeUrl("testString")
    .source(externalSourceModel)
    .sourceType("local")
    .commandParameter("testString")
    .bastion(targetResourcesetModel)
    .targets(new java.util.ArrayList<TargetResourceset>(java.util.Arrays.asList(targetResourcesetModel)))
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .triggerRecordId("testString")
    .state(actionStateModel)
    .sysLock(systemLockModel)
    .xGithubToken("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Action> response = schematicsService.createAction(createActionOptionsModel).execute();
    assertNotNull(response);
    Action responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createActionPath);
  }

  @Test
  public void testListActionsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"total_count\": 10, \"limit\": 5, \"offset\": 6, \"actions\": [{\"name\": \"Stop Action\", \"description\": \"This Action can be used to Stop the targets\", \"id\": \"id\", \"crn\": \"crn\", \"location\": \"us_south\", \"resource_group\": \"resourceGroup\", \"namespace\": \"namespace\", \"tags\": [\"tags\"], \"playbook_name\": \"playbookName\", \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00\"}, \"state\": {\"status_code\": \"normal\", \"status_message\": \"statusMessage\"}, \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00\"}, \"created_at\": \"2019-01-01T12:00:00\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00\", \"updated_by\": \"updatedBy\"}]}";
    String listActionsPath = "/v2/actions";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListActionsOptions model
    ListActionsOptions listActionsOptionsModel = new ListActionsOptions.Builder()
    .offset(Long.valueOf("0"))
    .limit(Long.valueOf("1"))
    .sort("testString")
    .profile("ids")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ActionList> response = schematicsService.listActions(listActionsOptionsModel).execute();
    assertNotNull(response);
    ActionList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    assertEquals(query.get("sort"), "testString");
    assertEquals(query.get("profile"), "ids");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listActionsPath);
  }

  @Test
  public void testGetActionWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"Stop Action\", \"description\": \"This Action can be used to Stop the targets\", \"location\": \"us_south\", \"resource_group\": \"resourceGroup\", \"tags\": [\"tags\"], \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00\"}, \"source_readme_url\": \"sourceReadmeUrl\", \"source\": {\"source_type\": \"local\", \"git\": {\"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}}, \"source_type\": \"local\", \"command_parameter\": \"commandParameter\", \"bastion\": {\"name\": \"name\", \"type\": \"type\", \"description\": \"description\", \"resource_query\": \"resourceQuery\", \"credential\": \"credential\", \"id\": \"id\", \"created_at\": \"2019-01-01T12:00:00\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00\", \"updated_by\": \"updatedBy\", \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00\"}, \"resource_ids\": [\"resourceIds\"]}, \"targets\": [{\"name\": \"name\", \"type\": \"type\", \"description\": \"description\", \"resource_query\": \"resourceQuery\", \"credential\": \"credential\", \"id\": \"id\", \"created_at\": \"2019-01-01T12:00:00\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00\", \"updated_by\": \"updatedBy\", \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00\"}, \"resource_ids\": [\"resourceIds\"]}], \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"trigger_record_id\": \"triggerRecordId\", \"id\": \"id\", \"crn\": \"crn\", \"account\": \"account\", \"source_created_at\": \"2019-01-01T12:00:00\", \"source_created_by\": \"sourceCreatedBy\", \"source_updated_at\": \"2019-01-01T12:00:00\", \"source_updated_by\": \"sourceUpdatedBy\", \"created_at\": \"2019-01-01T12:00:00\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00\", \"updated_by\": \"updatedBy\", \"namespace\": \"namespace\", \"state\": {\"status_code\": \"normal\", \"status_message\": \"statusMessage\"}, \"playbook_names\": [\"playbookNames\"], \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00\"}}";
    String getActionPath = "/v2/actions/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetActionOptions model
    GetActionOptions getActionOptionsModel = new GetActionOptions.Builder()
    .actionId("testString")
    .profile("summary")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Action> response = schematicsService.getAction(getActionOptionsModel).execute();
    assertNotNull(response);
    Action responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("profile"), "summary");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getActionPath);
  }

  // Test the getAction operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetActionNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematicsService.getAction(null).execute();
  }

  @Test
  public void testDeleteActionWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteActionPath = "/v2/actions/testString";

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteActionOptions model
    DeleteActionOptions deleteActionOptionsModel = new DeleteActionOptions.Builder()
    .actionId("testString")
    .force(true)
    .propagate(true)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = schematicsService.deleteAction(deleteActionOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteActionPath);
  }

  // Test the deleteAction operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteActionNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematicsService.deleteAction(null).execute();
  }

  @Test
  public void testUpdateActionWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"Stop Action\", \"description\": \"This Action can be used to Stop the targets\", \"location\": \"us_south\", \"resource_group\": \"resourceGroup\", \"tags\": [\"tags\"], \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00\"}, \"source_readme_url\": \"sourceReadmeUrl\", \"source\": {\"source_type\": \"local\", \"git\": {\"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}}, \"source_type\": \"local\", \"command_parameter\": \"commandParameter\", \"bastion\": {\"name\": \"name\", \"type\": \"type\", \"description\": \"description\", \"resource_query\": \"resourceQuery\", \"credential\": \"credential\", \"id\": \"id\", \"created_at\": \"2019-01-01T12:00:00\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00\", \"updated_by\": \"updatedBy\", \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00\"}, \"resource_ids\": [\"resourceIds\"]}, \"targets\": [{\"name\": \"name\", \"type\": \"type\", \"description\": \"description\", \"resource_query\": \"resourceQuery\", \"credential\": \"credential\", \"id\": \"id\", \"created_at\": \"2019-01-01T12:00:00\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00\", \"updated_by\": \"updatedBy\", \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00\"}, \"resource_ids\": [\"resourceIds\"]}], \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"trigger_record_id\": \"triggerRecordId\", \"id\": \"id\", \"crn\": \"crn\", \"account\": \"account\", \"source_created_at\": \"2019-01-01T12:00:00\", \"source_created_by\": \"sourceCreatedBy\", \"source_updated_at\": \"2019-01-01T12:00:00\", \"source_updated_by\": \"sourceUpdatedBy\", \"created_at\": \"2019-01-01T12:00:00\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00\", \"updated_by\": \"updatedBy\", \"namespace\": \"namespace\", \"state\": {\"status_code\": \"normal\", \"status_message\": \"statusMessage\"}, \"playbook_names\": [\"playbookNames\"], \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00\"}}";
    String updateActionPath = "/v2/actions/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UserState model
    UserState userStateModel = new UserState.Builder()
    .state("draft")
    .setBy("testString")
    .setAt(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
    .build();

    // Construct an instance of the ExternalSourceGit model
    ExternalSourceGit externalSourceGitModel = new ExternalSourceGit.Builder()
    .gitRepoUrl("testString")
    .gitToken("testString")
    .gitRepoFolder("testString")
    .gitRelease("testString")
    .gitBranch("testString")
    .build();

    // Construct an instance of the ExternalSource model
    ExternalSource externalSourceModel = new ExternalSource.Builder()
    .sourceType("local")
    .git(externalSourceGitModel)
    .build();

    // Construct an instance of the SystemLock model
    SystemLock systemLockModel = new SystemLock.Builder()
    .sysLocked(true)
    .sysLockedBy("testString")
    .sysLockedAt(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
    .build();

    // Construct an instance of the TargetResourceset model
    TargetResourceset targetResourcesetModel = new TargetResourceset.Builder()
    .name("testString")
    .type("testString")
    .description("testString")
    .resourceQuery("testString")
    .credential("testString")
    .sysLock(systemLockModel)
    .build();

    // Construct an instance of the VariableMetadata model
    VariableMetadata variableMetadataModel = new VariableMetadata.Builder()
    .type("boolean")
    .aliases(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .description("testString")
    .defaultValue("testString")
    .secure(true)
    .immutable(true)
    .hidden(true)
    .options(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .minValue(Long.valueOf("26"))
    .maxValue(Long.valueOf("26"))
    .minLength(Long.valueOf("26"))
    .maxLength(Long.valueOf("26"))
    .matches("testString")
    .position(Long.valueOf("26"))
    .groupBy("testString")
    .source("testString")
    .build();

    // Construct an instance of the VariableData model
    VariableData variableDataModel = new VariableData.Builder()
    .name("testString")
    .value("testString")
    .metadata(variableMetadataModel)
    .build();

    // Construct an instance of the ActionState model
    ActionState actionStateModel = new ActionState.Builder()
    .statusCode("normal")
    .statusMessage("testString")
    .build();

    // Construct an instance of the UpdateActionOptions model
    UpdateActionOptions updateActionOptionsModel = new UpdateActionOptions.Builder()
    .actionId("testString")
    .name("Stop Action")
    .description("This Action can be used to Stop the targets")
    .location("us_south")
    .resourceGroup("testString")
    .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .userState(userStateModel)
    .sourceReadmeUrl("testString")
    .source(externalSourceModel)
    .sourceType("local")
    .commandParameter("testString")
    .bastion(targetResourcesetModel)
    .targets(new java.util.ArrayList<TargetResourceset>(java.util.Arrays.asList(targetResourcesetModel)))
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .triggerRecordId("testString")
    .state(actionStateModel)
    .sysLock(systemLockModel)
    .xGithubToken("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Action> response = schematicsService.updateAction(updateActionOptionsModel).execute();
    assertNotNull(response);
    Action responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateActionPath);
  }

  // Test the updateAction operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateActionNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematicsService.updateAction(null).execute();
  }

  @Test
  public void testCreateJobWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"command_object\": \"workspace\", \"command_object_id\": \"commandObjectId\", \"command_name\": \"workspace_init_flow\", \"command_parameter\": \"commandParameter\", \"command_options\": [\"commandOptions\"], \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"tags\": [\"tags\"], \"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"location\": \"us_south\", \"resource_group\": \"resourceGroup\", \"submitted_at\": \"2019-01-01T12:00:00\", \"submitted_by\": \"submittedBy\", \"start_at\": \"2019-01-01T12:00:00\", \"end_at\": \"2019-01-01T12:00:00\", \"duration\": \"duration\", \"status\": {\"action_job_status\": {\"action_name\": \"actionName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"bastion_status_code\": \"none\", \"bastion_status_message\": \"bastionStatusMessage\", \"targets_status_code\": \"none\", \"targets_status_message\": \"targetsStatusMessage\", \"updated_at\": \"2019-01-01T12:00:00\"}}, \"data\": {\"job_type\": \"repo_download_job\", \"action_job_data\": {\"action_name\": \"actionName\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"updated_at\": \"2019-01-01T12:00:00\"}}, \"targets\": [{\"name\": \"name\", \"type\": \"type\", \"description\": \"description\", \"resource_query\": \"resourceQuery\", \"credential\": \"credential\", \"id\": \"id\", \"created_at\": \"2019-01-01T12:00:00\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00\", \"updated_by\": \"updatedBy\", \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00\"}, \"resource_ids\": [\"resourceIds\"]}], \"bastion\": {\"name\": \"name\", \"type\": \"type\", \"description\": \"description\", \"resource_query\": \"resourceQuery\", \"credential\": \"credential\", \"id\": \"id\", \"created_at\": \"2019-01-01T12:00:00\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00\", \"updated_by\": \"updatedBy\", \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00\"}, \"resource_ids\": [\"resourceIds\"]}, \"log_summary\": {\"job_id\": \"jobId\", \"job_type\": \"repo_download_job\", \"log_start_at\": \"2019-01-01T12:00:00\", \"log_analyzed_till\": \"2019-01-01T12:00:00\", \"elapsed_time\": 11, \"log_errors\": [{\"error_code\": \"errorCode\", \"error_msg\": \"errorMsg\", \"error_count\": 10}], \"repo_download_job\": {\"scanned_file_count\": 16, \"quarantined_file_count\": 20, \"detected_filetype\": \"detectedFiletype\", \"inputs_count\": \"inputsCount\", \"outputs_count\": \"outputsCount\"}, \"action_job\": {\"target_count\": 11, \"task_count\": 9, \"play_count\": 9, \"recap\": {\"target\": [\"target\"], \"ok\": 2, \"changed\": 7, \"failed\": 6, \"skipped\": 7, \"unreachable\": 11}}}, \"log_store_url\": \"logStoreUrl\", \"state_store_url\": \"stateStoreUrl\", \"results_url\": \"resultsUrl\", \"updated_at\": \"2019-01-01T12:00:00\"}";
    String createJobPath = "/v2/jobs";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(202)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the VariableMetadata model
    VariableMetadata variableMetadataModel = new VariableMetadata.Builder()
    .type("boolean")
    .aliases(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .description("testString")
    .defaultValue("testString")
    .secure(true)
    .immutable(true)
    .hidden(true)
    .options(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .minValue(Long.valueOf("26"))
    .maxValue(Long.valueOf("26"))
    .minLength(Long.valueOf("26"))
    .maxLength(Long.valueOf("26"))
    .matches("testString")
    .position(Long.valueOf("26"))
    .groupBy("testString")
    .source("testString")
    .build();

    // Construct an instance of the VariableData model
    VariableData variableDataModel = new VariableData.Builder()
    .name("testString")
    .value("testString")
    .metadata(variableMetadataModel)
    .build();

    // Construct an instance of the JobStatusAction model
    JobStatusAction jobStatusActionModel = new JobStatusAction.Builder()
    .actionName("testString")
    .statusCode("job_pending")
    .statusMessage("testString")
    .bastionStatusCode("none")
    .bastionStatusMessage("testString")
    .targetsStatusCode("none")
    .targetsStatusMessage("testString")
    .updatedAt(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
    .build();

    // Construct an instance of the JobStatus model
    JobStatus jobStatusModel = new JobStatus.Builder()
    .actionJobStatus(jobStatusActionModel)
    .build();

    // Construct an instance of the JobDataAction model
    JobDataAction jobDataActionModel = new JobDataAction.Builder()
    .actionName("testString")
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .updatedAt(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
    .build();

    // Construct an instance of the JobData model
    JobData jobDataModel = new JobData.Builder()
    .jobType("repo_download_job")
    .actionJobData(jobDataActionModel)
    .build();

    // Construct an instance of the SystemLock model
    SystemLock systemLockModel = new SystemLock.Builder()
    .sysLocked(true)
    .sysLockedBy("testString")
    .sysLockedAt(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
    .build();

    // Construct an instance of the TargetResourceset model
    TargetResourceset targetResourcesetModel = new TargetResourceset.Builder()
    .name("testString")
    .type("testString")
    .description("testString")
    .resourceQuery("testString")
    .credential("testString")
    .sysLock(systemLockModel)
    .build();

    // Construct an instance of the JobLogSummaryRepoDownloadJob model
    JobLogSummaryRepoDownloadJob jobLogSummaryRepoDownloadJobModel = new JobLogSummaryRepoDownloadJob.Builder()
    .build();

    // Construct an instance of the JobLogSummaryActionJobRecap model
    JobLogSummaryActionJobRecap jobLogSummaryActionJobRecapModel = new JobLogSummaryActionJobRecap.Builder()
    .target(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .ok(Double.valueOf("72.5"))
    .changed(Double.valueOf("72.5"))
    .failed(Double.valueOf("72.5"))
    .skipped(Double.valueOf("72.5"))
    .unreachable(Double.valueOf("72.5"))
    .build();

    // Construct an instance of the JobLogSummaryActionJob model
    JobLogSummaryActionJob jobLogSummaryActionJobModel = new JobLogSummaryActionJob.Builder()
    .recap(jobLogSummaryActionJobRecapModel)
    .build();

    // Construct an instance of the JobLogSummary model
    JobLogSummary jobLogSummaryModel = new JobLogSummary.Builder()
    .jobType("repo_download_job")
    .repoDownloadJob(jobLogSummaryRepoDownloadJobModel)
    .actionJob(jobLogSummaryActionJobModel)
    .build();

    // Construct an instance of the CreateJobOptions model
    CreateJobOptions createJobOptionsModel = new CreateJobOptions.Builder()
    .refreshToken("testString")
    .commandObject("workspace")
    .commandObjectId("testString")
    .commandName("workspace_init_flow")
    .commandParameter("testString")
    .commandOptions(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .location("us_south")
    .status(jobStatusModel)
    .data(jobDataModel)
    .bastion(targetResourcesetModel)
    .logSummary(jobLogSummaryModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Job> response = schematicsService.createJob(createJobOptionsModel).execute();
    assertNotNull(response);
    Job responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    assertEquals(request.getHeader("Refresh_token"), "testString");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createJobPath);
  }

  // Test the createJob operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateJobNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematicsService.createJob(null).execute();
  }

  @Test
  public void testListJobsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"total_count\": 10, \"limit\": 5, \"offset\": 6, \"jobs\": [{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"command_object\": \"workspace\", \"command_object_id\": \"commandObjectId\", \"command_name\": \"workspace_init_flow\", \"tags\": [\"tags\"], \"location\": \"us_south\", \"resource_group\": \"resourceGroup\", \"targets\": [{\"name\": \"name\", \"type\": \"type\", \"description\": \"description\", \"resource_query\": \"resourceQuery\", \"credential\": \"credential\", \"id\": \"id\", \"created_at\": \"2019-01-01T12:00:00\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00\", \"updated_by\": \"updatedBy\", \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00\"}, \"resource_ids\": [\"resourceIds\"]}], \"submitted_at\": \"2019-01-01T12:00:00\", \"submitted_by\": \"submittedBy\", \"duration\": \"duration\", \"start_at\": \"2019-01-01T12:00:00\", \"end_at\": \"2019-01-01T12:00:00\", \"status\": {\"action_job_status\": {\"action_name\": \"actionName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"bastion_status_code\": \"none\", \"bastion_status_message\": \"bastionStatusMessage\", \"targets_status_code\": \"none\", \"targets_status_message\": \"targetsStatusMessage\", \"updated_at\": \"2019-01-01T12:00:00\"}}, \"log_summary\": {\"job_id\": \"jobId\", \"job_type\": \"repo_download_job\", \"log_start_at\": \"2019-01-01T12:00:00\", \"log_analyzed_till\": \"2019-01-01T12:00:00\", \"elapsed_time\": 11, \"log_errors\": [{\"error_code\": \"errorCode\", \"error_msg\": \"errorMsg\", \"error_count\": 10}], \"repo_download_job\": {\"scanned_file_count\": 16, \"quarantined_file_count\": 20, \"detected_filetype\": \"detectedFiletype\", \"inputs_count\": \"inputsCount\", \"outputs_count\": \"outputsCount\"}, \"action_job\": {\"target_count\": 11, \"task_count\": 9, \"play_count\": 9, \"recap\": {\"target\": [\"target\"], \"ok\": 2, \"changed\": 7, \"failed\": 6, \"skipped\": 7, \"unreachable\": 11}}}, \"updated_at\": \"2019-01-01T12:00:00\"}]}";
    String listJobsPath = "/v2/jobs";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListJobsOptions model
    ListJobsOptions listJobsOptionsModel = new ListJobsOptions.Builder()
    .offset(Long.valueOf("0"))
    .limit(Long.valueOf("1"))
    .sort("testString")
    .profile("ids")
    .resource("workspaces")
    .actionId("testString")
    .list("all")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<JobList> response = schematicsService.listJobs(listJobsOptionsModel).execute();
    assertNotNull(response);
    JobList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    assertEquals(query.get("sort"), "testString");
    assertEquals(query.get("profile"), "ids");
    assertEquals(query.get("resource"), "workspaces");
    assertEquals(query.get("action_id"), "testString");
    assertEquals(query.get("list"), "all");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listJobsPath);
  }

  @Test
  public void testReplaceJobWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"command_object\": \"workspace\", \"command_object_id\": \"commandObjectId\", \"command_name\": \"workspace_init_flow\", \"command_parameter\": \"commandParameter\", \"command_options\": [\"commandOptions\"], \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"tags\": [\"tags\"], \"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"location\": \"us_south\", \"resource_group\": \"resourceGroup\", \"submitted_at\": \"2019-01-01T12:00:00\", \"submitted_by\": \"submittedBy\", \"start_at\": \"2019-01-01T12:00:00\", \"end_at\": \"2019-01-01T12:00:00\", \"duration\": \"duration\", \"status\": {\"action_job_status\": {\"action_name\": \"actionName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"bastion_status_code\": \"none\", \"bastion_status_message\": \"bastionStatusMessage\", \"targets_status_code\": \"none\", \"targets_status_message\": \"targetsStatusMessage\", \"updated_at\": \"2019-01-01T12:00:00\"}}, \"data\": {\"job_type\": \"repo_download_job\", \"action_job_data\": {\"action_name\": \"actionName\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"updated_at\": \"2019-01-01T12:00:00\"}}, \"targets\": [{\"name\": \"name\", \"type\": \"type\", \"description\": \"description\", \"resource_query\": \"resourceQuery\", \"credential\": \"credential\", \"id\": \"id\", \"created_at\": \"2019-01-01T12:00:00\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00\", \"updated_by\": \"updatedBy\", \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00\"}, \"resource_ids\": [\"resourceIds\"]}], \"bastion\": {\"name\": \"name\", \"type\": \"type\", \"description\": \"description\", \"resource_query\": \"resourceQuery\", \"credential\": \"credential\", \"id\": \"id\", \"created_at\": \"2019-01-01T12:00:00\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00\", \"updated_by\": \"updatedBy\", \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00\"}, \"resource_ids\": [\"resourceIds\"]}, \"log_summary\": {\"job_id\": \"jobId\", \"job_type\": \"repo_download_job\", \"log_start_at\": \"2019-01-01T12:00:00\", \"log_analyzed_till\": \"2019-01-01T12:00:00\", \"elapsed_time\": 11, \"log_errors\": [{\"error_code\": \"errorCode\", \"error_msg\": \"errorMsg\", \"error_count\": 10}], \"repo_download_job\": {\"scanned_file_count\": 16, \"quarantined_file_count\": 20, \"detected_filetype\": \"detectedFiletype\", \"inputs_count\": \"inputsCount\", \"outputs_count\": \"outputsCount\"}, \"action_job\": {\"target_count\": 11, \"task_count\": 9, \"play_count\": 9, \"recap\": {\"target\": [\"target\"], \"ok\": 2, \"changed\": 7, \"failed\": 6, \"skipped\": 7, \"unreachable\": 11}}}, \"log_store_url\": \"logStoreUrl\", \"state_store_url\": \"stateStoreUrl\", \"results_url\": \"resultsUrl\", \"updated_at\": \"2019-01-01T12:00:00\"}";
    String replaceJobPath = "/v2/jobs/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(202)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the VariableMetadata model
    VariableMetadata variableMetadataModel = new VariableMetadata.Builder()
    .type("boolean")
    .aliases(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .description("testString")
    .defaultValue("testString")
    .secure(true)
    .immutable(true)
    .hidden(true)
    .options(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .minValue(Long.valueOf("26"))
    .maxValue(Long.valueOf("26"))
    .minLength(Long.valueOf("26"))
    .maxLength(Long.valueOf("26"))
    .matches("testString")
    .position(Long.valueOf("26"))
    .groupBy("testString")
    .source("testString")
    .build();

    // Construct an instance of the VariableData model
    VariableData variableDataModel = new VariableData.Builder()
    .name("testString")
    .value("testString")
    .metadata(variableMetadataModel)
    .build();

    // Construct an instance of the JobStatusAction model
    JobStatusAction jobStatusActionModel = new JobStatusAction.Builder()
    .actionName("testString")
    .statusCode("job_pending")
    .statusMessage("testString")
    .bastionStatusCode("none")
    .bastionStatusMessage("testString")
    .targetsStatusCode("none")
    .targetsStatusMessage("testString")
    .updatedAt(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
    .build();

    // Construct an instance of the JobStatus model
    JobStatus jobStatusModel = new JobStatus.Builder()
    .actionJobStatus(jobStatusActionModel)
    .build();

    // Construct an instance of the JobDataAction model
    JobDataAction jobDataActionModel = new JobDataAction.Builder()
    .actionName("testString")
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .updatedAt(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
    .build();

    // Construct an instance of the JobData model
    JobData jobDataModel = new JobData.Builder()
    .jobType("repo_download_job")
    .actionJobData(jobDataActionModel)
    .build();

    // Construct an instance of the SystemLock model
    SystemLock systemLockModel = new SystemLock.Builder()
    .sysLocked(true)
    .sysLockedBy("testString")
    .sysLockedAt(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
    .build();

    // Construct an instance of the TargetResourceset model
    TargetResourceset targetResourcesetModel = new TargetResourceset.Builder()
    .name("testString")
    .type("testString")
    .description("testString")
    .resourceQuery("testString")
    .credential("testString")
    .sysLock(systemLockModel)
    .build();

    // Construct an instance of the JobLogSummaryRepoDownloadJob model
    JobLogSummaryRepoDownloadJob jobLogSummaryRepoDownloadJobModel = new JobLogSummaryRepoDownloadJob.Builder()
    .build();

    // Construct an instance of the JobLogSummaryActionJobRecap model
    JobLogSummaryActionJobRecap jobLogSummaryActionJobRecapModel = new JobLogSummaryActionJobRecap.Builder()
    .target(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .ok(Double.valueOf("72.5"))
    .changed(Double.valueOf("72.5"))
    .failed(Double.valueOf("72.5"))
    .skipped(Double.valueOf("72.5"))
    .unreachable(Double.valueOf("72.5"))
    .build();

    // Construct an instance of the JobLogSummaryActionJob model
    JobLogSummaryActionJob jobLogSummaryActionJobModel = new JobLogSummaryActionJob.Builder()
    .recap(jobLogSummaryActionJobRecapModel)
    .build();

    // Construct an instance of the JobLogSummary model
    JobLogSummary jobLogSummaryModel = new JobLogSummary.Builder()
    .jobType("repo_download_job")
    .repoDownloadJob(jobLogSummaryRepoDownloadJobModel)
    .actionJob(jobLogSummaryActionJobModel)
    .build();

    // Construct an instance of the ReplaceJobOptions model
    ReplaceJobOptions replaceJobOptionsModel = new ReplaceJobOptions.Builder()
    .jobId("testString")
    .refreshToken("testString")
    .commandObject("workspace")
    .commandObjectId("testString")
    .commandName("workspace_init_flow")
    .commandParameter("testString")
    .commandOptions(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .location("us_south")
    .status(jobStatusModel)
    .data(jobDataModel)
    .bastion(targetResourcesetModel)
    .logSummary(jobLogSummaryModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Job> response = schematicsService.replaceJob(replaceJobOptionsModel).execute();
    assertNotNull(response);
    Job responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    assertEquals(request.getHeader("Refresh_token"), "testString");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceJobPath);
  }

  // Test the replaceJob operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceJobNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematicsService.replaceJob(null).execute();
  }

  @Test
  public void testDeleteJobWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteJobPath = "/v2/jobs/testString";

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteJobOptions model
    DeleteJobOptions deleteJobOptionsModel = new DeleteJobOptions.Builder()
    .jobId("testString")
    .refreshToken("testString")
    .force(true)
    .propagate(true)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = schematicsService.deleteJob(deleteJobOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    assertEquals(request.getHeader("Refresh_token"), "testString");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteJobPath);
  }

  // Test the deleteJob operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteJobNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematicsService.deleteJob(null).execute();
  }

  @Test
  public void testGetJobWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"command_object\": \"workspace\", \"command_object_id\": \"commandObjectId\", \"command_name\": \"workspace_init_flow\", \"command_parameter\": \"commandParameter\", \"command_options\": [\"commandOptions\"], \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"tags\": [\"tags\"], \"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"location\": \"us_south\", \"resource_group\": \"resourceGroup\", \"submitted_at\": \"2019-01-01T12:00:00\", \"submitted_by\": \"submittedBy\", \"start_at\": \"2019-01-01T12:00:00\", \"end_at\": \"2019-01-01T12:00:00\", \"duration\": \"duration\", \"status\": {\"action_job_status\": {\"action_name\": \"actionName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"bastion_status_code\": \"none\", \"bastion_status_message\": \"bastionStatusMessage\", \"targets_status_code\": \"none\", \"targets_status_message\": \"targetsStatusMessage\", \"updated_at\": \"2019-01-01T12:00:00\"}}, \"data\": {\"job_type\": \"repo_download_job\", \"action_job_data\": {\"action_name\": \"actionName\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"updated_at\": \"2019-01-01T12:00:00\"}}, \"targets\": [{\"name\": \"name\", \"type\": \"type\", \"description\": \"description\", \"resource_query\": \"resourceQuery\", \"credential\": \"credential\", \"id\": \"id\", \"created_at\": \"2019-01-01T12:00:00\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00\", \"updated_by\": \"updatedBy\", \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00\"}, \"resource_ids\": [\"resourceIds\"]}], \"bastion\": {\"name\": \"name\", \"type\": \"type\", \"description\": \"description\", \"resource_query\": \"resourceQuery\", \"credential\": \"credential\", \"id\": \"id\", \"created_at\": \"2019-01-01T12:00:00\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00\", \"updated_by\": \"updatedBy\", \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00\"}, \"resource_ids\": [\"resourceIds\"]}, \"log_summary\": {\"job_id\": \"jobId\", \"job_type\": \"repo_download_job\", \"log_start_at\": \"2019-01-01T12:00:00\", \"log_analyzed_till\": \"2019-01-01T12:00:00\", \"elapsed_time\": 11, \"log_errors\": [{\"error_code\": \"errorCode\", \"error_msg\": \"errorMsg\", \"error_count\": 10}], \"repo_download_job\": {\"scanned_file_count\": 16, \"quarantined_file_count\": 20, \"detected_filetype\": \"detectedFiletype\", \"inputs_count\": \"inputsCount\", \"outputs_count\": \"outputsCount\"}, \"action_job\": {\"target_count\": 11, \"task_count\": 9, \"play_count\": 9, \"recap\": {\"target\": [\"target\"], \"ok\": 2, \"changed\": 7, \"failed\": 6, \"skipped\": 7, \"unreachable\": 11}}}, \"log_store_url\": \"logStoreUrl\", \"state_store_url\": \"stateStoreUrl\", \"results_url\": \"resultsUrl\", \"updated_at\": \"2019-01-01T12:00:00\"}";
    String getJobPath = "/v2/jobs/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetJobOptions model
    GetJobOptions getJobOptionsModel = new GetJobOptions.Builder()
    .jobId("testString")
    .profile("summary")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Job> response = schematicsService.getJob(getJobOptionsModel).execute();
    assertNotNull(response);
    Job responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("profile"), "summary");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getJobPath);
  }

  // Test the getJob operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetJobNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematicsService.getJob(null).execute();
  }

  @Test
  public void testListJobLogsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"job_id\": \"jobId\", \"job_name\": \"jobName\", \"log_summary\": {\"job_id\": \"jobId\", \"job_type\": \"repo_download_job\", \"log_start_at\": \"2019-01-01T12:00:00\", \"log_analyzed_till\": \"2019-01-01T12:00:00\", \"elapsed_time\": 11, \"log_errors\": [{\"error_code\": \"errorCode\", \"error_msg\": \"errorMsg\", \"error_count\": 10}], \"repo_download_job\": {\"scanned_file_count\": 16, \"quarantined_file_count\": 20, \"detected_filetype\": \"detectedFiletype\", \"inputs_count\": \"inputsCount\", \"outputs_count\": \"outputsCount\"}, \"action_job\": {\"target_count\": 11, \"task_count\": 9, \"play_count\": 9, \"recap\": {\"target\": [\"target\"], \"ok\": 2, \"changed\": 7, \"failed\": 6, \"skipped\": 7, \"unreachable\": 11}}}, \"format\": \"json\", \"details\": \"VGhpcyBpcyBhbiBlbmNvZGVkIGJ5dGUgYXJyYXku\", \"updated_at\": \"2019-01-01T12:00:00\"}";
    String listJobLogsPath = "/v2/jobs/testString/logs";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(202)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListJobLogsOptions model
    ListJobLogsOptions listJobLogsOptionsModel = new ListJobLogsOptions.Builder()
    .jobId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<JobLog> response = schematicsService.listJobLogs(listJobLogsOptionsModel).execute();
    assertNotNull(response);
    JobLog responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listJobLogsPath);
  }

  // Test the listJobLogs operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListJobLogsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematicsService.listJobLogs(null).execute();
  }

  @Test
  public void testListJobStatesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"job_id\": \"jobId\", \"job_name\": \"jobName\", \"summary\": [{\"name\": \"name\", \"type\": \"number\", \"value\": \"value\"}], \"format\": \"format\", \"details\": \"VGhpcyBpcyBhbiBlbmNvZGVkIGJ5dGUgYXJyYXku\", \"updated_at\": \"2019-01-01T12:00:00\"}";
    String listJobStatesPath = "/v2/jobs/testString/states";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(202)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListJobStatesOptions model
    ListJobStatesOptions listJobStatesOptionsModel = new ListJobStatesOptions.Builder()
    .jobId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<JobStateData> response = schematicsService.listJobStates(listJobStatesOptionsModel).execute();
    assertNotNull(response);
    JobStateData responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listJobStatesPath);
  }

  // Test the listJobStates operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListJobStatesNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematicsService.listJobStates(null).execute();
  }

  @Test
  public void testListSharedDatasetsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"count\": 5, \"shared_datasets\": [{\"account\": \"account\", \"created_at\": \"2019-01-01T12:00:00\", \"created_by\": \"createdBy\", \"description\": \"description\", \"effected_workspace_ids\": [\"effectedWorkspaceIds\"], \"resource_group\": \"resourceGroup\", \"shared_dataset_data\": [{\"default_value\": \"defaultValue\", \"description\": \"description\", \"hidden\": true, \"immutable\": false, \"matches\": \"matches\", \"max_value\": \"maxValue\", \"max_value_len\": \"maxValueLen\", \"min_value\": \"minValue\", \"min_value_len\": \"minValueLen\", \"options\": [\"options\"], \"override_value\": \"overrideValue\", \"secure\": true, \"var_aliases\": [\"varAliases\"], \"var_name\": \"varName\", \"var_ref\": \"varRef\", \"var_type\": \"varType\"}], \"shared_dataset_id\": \"sharedDatasetId\", \"shared_dataset_name\": \"sharedDatasetName\", \"shared_dataset_type\": [\"sharedDatasetType\"], \"state\": \"state\", \"tags\": [\"tags\"], \"updated_at\": \"2019-01-01T12:00:00\", \"updated_by\": \"updatedBy\", \"version\": \"version\"}]}";
    String listSharedDatasetsPath = "/v2/shared_datasets";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListSharedDatasetsOptions model
    ListSharedDatasetsOptions listSharedDatasetsOptionsModel = new ListSharedDatasetsOptions();

    // Invoke operation with valid options model (positive test)
    Response<SharedDatasetResponseList> response = schematicsService.listSharedDatasets(listSharedDatasetsOptionsModel).execute();
    assertNotNull(response);
    SharedDatasetResponseList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listSharedDatasetsPath);
  }

  @Test
  public void testCreateSharedDatasetWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"account\": \"account\", \"created_at\": \"2019-01-01T12:00:00\", \"created_by\": \"createdBy\", \"description\": \"description\", \"effected_workspace_ids\": [\"effectedWorkspaceIds\"], \"resource_group\": \"resourceGroup\", \"shared_dataset_data\": [{\"default_value\": \"defaultValue\", \"description\": \"description\", \"hidden\": true, \"immutable\": false, \"matches\": \"matches\", \"max_value\": \"maxValue\", \"max_value_len\": \"maxValueLen\", \"min_value\": \"minValue\", \"min_value_len\": \"minValueLen\", \"options\": [\"options\"], \"override_value\": \"overrideValue\", \"secure\": true, \"var_aliases\": [\"varAliases\"], \"var_name\": \"varName\", \"var_ref\": \"varRef\", \"var_type\": \"varType\"}], \"shared_dataset_id\": \"sharedDatasetId\", \"shared_dataset_name\": \"sharedDatasetName\", \"shared_dataset_type\": [\"sharedDatasetType\"], \"state\": \"state\", \"tags\": [\"tags\"], \"updated_at\": \"2019-01-01T12:00:00\", \"updated_by\": \"updatedBy\", \"version\": \"version\"}";
    String createSharedDatasetPath = "/v2/shared_datasets";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the SharedDatasetData model
    SharedDatasetData sharedDatasetDataModel = new SharedDatasetData.Builder()
    .defaultValue("testString")
    .description("testString")
    .hidden(true)
    .immutable(true)
    .matches("testString")
    .maxValue("testString")
    .maxValueLen("testString")
    .minValue("testString")
    .minValueLen("testString")
    .options(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .overrideValue("testString")
    .secure(true)
    .varAliases(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .varName("testString")
    .varRef("testString")
    .varType("testString")
    .build();

    // Construct an instance of the CreateSharedDatasetOptions model
    CreateSharedDatasetOptions createSharedDatasetOptionsModel = new CreateSharedDatasetOptions.Builder()
    .autoPropagateChange(true)
    .description("testString")
    .effectedWorkspaceIds(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .resourceGroup("testString")
    .sharedDatasetData(new java.util.ArrayList<SharedDatasetData>(java.util.Arrays.asList(sharedDatasetDataModel)))
    .sharedDatasetName("testString")
    .sharedDatasetSourceName("testString")
    .sharedDatasetType(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .version("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<SharedDatasetResponse> response = schematicsService.createSharedDataset(createSharedDatasetOptionsModel).execute();
    assertNotNull(response);
    SharedDatasetResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createSharedDatasetPath);
  }

  @Test
  public void testGetSharedDatasetWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"account\": \"account\", \"created_at\": \"2019-01-01T12:00:00\", \"created_by\": \"createdBy\", \"description\": \"description\", \"effected_workspace_ids\": [\"effectedWorkspaceIds\"], \"resource_group\": \"resourceGroup\", \"shared_dataset_data\": [{\"default_value\": \"defaultValue\", \"description\": \"description\", \"hidden\": true, \"immutable\": false, \"matches\": \"matches\", \"max_value\": \"maxValue\", \"max_value_len\": \"maxValueLen\", \"min_value\": \"minValue\", \"min_value_len\": \"minValueLen\", \"options\": [\"options\"], \"override_value\": \"overrideValue\", \"secure\": true, \"var_aliases\": [\"varAliases\"], \"var_name\": \"varName\", \"var_ref\": \"varRef\", \"var_type\": \"varType\"}], \"shared_dataset_id\": \"sharedDatasetId\", \"shared_dataset_name\": \"sharedDatasetName\", \"shared_dataset_type\": [\"sharedDatasetType\"], \"state\": \"state\", \"tags\": [\"tags\"], \"updated_at\": \"2019-01-01T12:00:00\", \"updated_by\": \"updatedBy\", \"version\": \"version\"}";
    String getSharedDatasetPath = "/v2/shared_datasets/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetSharedDatasetOptions model
    GetSharedDatasetOptions getSharedDatasetOptionsModel = new GetSharedDatasetOptions.Builder()
    .sdId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<SharedDatasetResponse> response = schematicsService.getSharedDataset(getSharedDatasetOptionsModel).execute();
    assertNotNull(response);
    SharedDatasetResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSharedDatasetPath);
  }

  // Test the getSharedDataset operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetSharedDatasetNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematicsService.getSharedDataset(null).execute();
  }

  @Test
  public void testReplaceSharedDatasetWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"account\": \"account\", \"created_at\": \"2019-01-01T12:00:00\", \"created_by\": \"createdBy\", \"description\": \"description\", \"effected_workspace_ids\": [\"effectedWorkspaceIds\"], \"resource_group\": \"resourceGroup\", \"shared_dataset_data\": [{\"default_value\": \"defaultValue\", \"description\": \"description\", \"hidden\": true, \"immutable\": false, \"matches\": \"matches\", \"max_value\": \"maxValue\", \"max_value_len\": \"maxValueLen\", \"min_value\": \"minValue\", \"min_value_len\": \"minValueLen\", \"options\": [\"options\"], \"override_value\": \"overrideValue\", \"secure\": true, \"var_aliases\": [\"varAliases\"], \"var_name\": \"varName\", \"var_ref\": \"varRef\", \"var_type\": \"varType\"}], \"shared_dataset_id\": \"sharedDatasetId\", \"shared_dataset_name\": \"sharedDatasetName\", \"shared_dataset_type\": [\"sharedDatasetType\"], \"state\": \"state\", \"tags\": [\"tags\"], \"updated_at\": \"2019-01-01T12:00:00\", \"updated_by\": \"updatedBy\", \"version\": \"version\"}";
    String replaceSharedDatasetPath = "/v2/shared_datasets/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the SharedDatasetData model
    SharedDatasetData sharedDatasetDataModel = new SharedDatasetData.Builder()
    .defaultValue("testString")
    .description("testString")
    .hidden(true)
    .immutable(true)
    .matches("testString")
    .maxValue("testString")
    .maxValueLen("testString")
    .minValue("testString")
    .minValueLen("testString")
    .options(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .overrideValue("testString")
    .secure(true)
    .varAliases(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .varName("testString")
    .varRef("testString")
    .varType("testString")
    .build();

    // Construct an instance of the ReplaceSharedDatasetOptions model
    ReplaceSharedDatasetOptions replaceSharedDatasetOptionsModel = new ReplaceSharedDatasetOptions.Builder()
    .sdId("testString")
    .autoPropagateChange(true)
    .description("testString")
    .effectedWorkspaceIds(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .resourceGroup("testString")
    .sharedDatasetData(new java.util.ArrayList<SharedDatasetData>(java.util.Arrays.asList(sharedDatasetDataModel)))
    .sharedDatasetName("testString")
    .sharedDatasetSourceName("testString")
    .sharedDatasetType(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .version("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<SharedDatasetResponse> response = schematicsService.replaceSharedDataset(replaceSharedDatasetOptionsModel).execute();
    assertNotNull(response);
    SharedDatasetResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceSharedDatasetPath);
  }

  // Test the replaceSharedDataset operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceSharedDatasetNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematicsService.replaceSharedDataset(null).execute();
  }

  @Test
  public void testDeleteSharedDatasetWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"account\": \"account\", \"created_at\": \"2019-01-01T12:00:00\", \"created_by\": \"createdBy\", \"description\": \"description\", \"effected_workspace_ids\": [\"effectedWorkspaceIds\"], \"resource_group\": \"resourceGroup\", \"shared_dataset_data\": [{\"default_value\": \"defaultValue\", \"description\": \"description\", \"hidden\": true, \"immutable\": false, \"matches\": \"matches\", \"max_value\": \"maxValue\", \"max_value_len\": \"maxValueLen\", \"min_value\": \"minValue\", \"min_value_len\": \"minValueLen\", \"options\": [\"options\"], \"override_value\": \"overrideValue\", \"secure\": true, \"var_aliases\": [\"varAliases\"], \"var_name\": \"varName\", \"var_ref\": \"varRef\", \"var_type\": \"varType\"}], \"shared_dataset_id\": \"sharedDatasetId\", \"shared_dataset_name\": \"sharedDatasetName\", \"shared_dataset_type\": [\"sharedDatasetType\"], \"state\": \"state\", \"tags\": [\"tags\"], \"updated_at\": \"2019-01-01T12:00:00\", \"updated_by\": \"updatedBy\", \"version\": \"version\"}";
    String deleteSharedDatasetPath = "/v2/shared_datasets/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteSharedDatasetOptions model
    DeleteSharedDatasetOptions deleteSharedDatasetOptionsModel = new DeleteSharedDatasetOptions.Builder()
    .sdId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<SharedDatasetResponse> response = schematicsService.deleteSharedDataset(deleteSharedDatasetOptionsModel).execute();
    assertNotNull(response);
    SharedDatasetResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteSharedDatasetPath);
  }

  // Test the deleteSharedDataset operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteSharedDatasetNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematicsService.deleteSharedDataset(null).execute();
  }

  @Test
  public void testGetKmsSettingsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"location\": \"location\", \"encryption_scheme\": \"encryptionScheme\", \"resource_group\": \"resourceGroup\", \"primary_crk\": {\"kms_name\": \"kmsName\", \"kms_private_endpoint\": \"kmsPrivateEndpoint\", \"key_crn\": \"keyCrn\"}, \"secondary_crk\": {\"kms_name\": \"kmsName\", \"kms_private_endpoint\": \"kmsPrivateEndpoint\", \"key_crn\": \"keyCrn\"}}";
    String getKmsSettingsPath = "/v2/settings/kms";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetKmsSettingsOptions model
    GetKmsSettingsOptions getKmsSettingsOptionsModel = new GetKmsSettingsOptions.Builder()
    .location("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<KMSSettings> response = schematicsService.getKmsSettings(getKmsSettingsOptionsModel).execute();
    assertNotNull(response);
    KMSSettings responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("location"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getKmsSettingsPath);
  }

  // Test the getKmsSettings operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetKmsSettingsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematicsService.getKmsSettings(null).execute();
  }

  @Test
  public void testReplaceKmsSettingsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"location\": \"location\", \"encryption_scheme\": \"encryptionScheme\", \"resource_group\": \"resourceGroup\", \"primary_crk\": {\"kms_name\": \"kmsName\", \"kms_private_endpoint\": \"kmsPrivateEndpoint\", \"key_crn\": \"keyCrn\"}, \"secondary_crk\": {\"kms_name\": \"kmsName\", \"kms_private_endpoint\": \"kmsPrivateEndpoint\", \"key_crn\": \"keyCrn\"}}";
    String replaceKmsSettingsPath = "/v2/settings/kms";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the KMSSettingsPrimaryCrk model
    KMSSettingsPrimaryCrk kmsSettingsPrimaryCrkModel = new KMSSettingsPrimaryCrk.Builder()
    .kmsName("testString")
    .kmsPrivateEndpoint("testString")
    .keyCrn("testString")
    .build();

    // Construct an instance of the KMSSettingsSecondaryCrk model
    KMSSettingsSecondaryCrk kmsSettingsSecondaryCrkModel = new KMSSettingsSecondaryCrk.Builder()
    .kmsName("testString")
    .kmsPrivateEndpoint("testString")
    .keyCrn("testString")
    .build();

    // Construct an instance of the ReplaceKmsSettingsOptions model
    ReplaceKmsSettingsOptions replaceKmsSettingsOptionsModel = new ReplaceKmsSettingsOptions.Builder()
    .location("testString")
    .encryptionScheme("testString")
    .resourceGroup("testString")
    .primaryCrk(kmsSettingsPrimaryCrkModel)
    .secondaryCrk(kmsSettingsSecondaryCrkModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<KMSSettings> response = schematicsService.replaceKmsSettings(replaceKmsSettingsOptionsModel).execute();
    assertNotNull(response);
    KMSSettings responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceKmsSettingsPath);
  }

  @Test
  public void testGetDiscoveredKmsInstancesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"total_count\": 10, \"limit\": 5, \"offset\": 6, \"kms_instances\": [{\"location\": \"location\", \"encryption_scheme\": \"encryptionScheme\", \"resource_group\": \"resourceGroup\", \"kms_crn\": \"kmsCrn\", \"kms_name\": \"kmsName\", \"kms_private_endpoint\": \"kmsPrivateEndpoint\", \"kms_public_endpoint\": \"kmsPublicEndpoint\", \"keys\": [{\"name\": \"name\", \"crn\": \"crn\", \"error\": \"error\"}]}]}";
    String getDiscoveredKmsInstancesPath = "/v2/settings/kms_instances";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetDiscoveredKmsInstancesOptions model
    GetDiscoveredKmsInstancesOptions getDiscoveredKmsInstancesOptionsModel = new GetDiscoveredKmsInstancesOptions.Builder()
    .encryptionScheme("testString")
    .location("testString")
    .resourceGroup("testString")
    .limit(Long.valueOf("1"))
    .sort("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<KMSDiscovery> response = schematicsService.getDiscoveredKmsInstances(getDiscoveredKmsInstancesOptionsModel).execute();
    assertNotNull(response);
    KMSDiscovery responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("encryption_scheme"), "testString");
    assertEquals(query.get("location"), "testString");
    assertEquals(query.get("resource_group"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    assertEquals(query.get("sort"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDiscoveredKmsInstancesPath);
  }

  // Test the getDiscoveredKmsInstances operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDiscoveredKmsInstancesNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematicsService.getDiscoveredKmsInstances(null).execute();
  }

  /** Initialize the server */
  @BeforeMethod
  public void setUpMockServer() {
    try {
        server = new MockWebServer();
        // register handler
        server.start();
        }
    catch (IOException err) {
        fail("Failed to instantiate mock web server");
    }
  }

  @AfterMethod
  public void tearDownMockServer() throws IOException {
    server.shutdown();
    schematicsService = null;
  }
}