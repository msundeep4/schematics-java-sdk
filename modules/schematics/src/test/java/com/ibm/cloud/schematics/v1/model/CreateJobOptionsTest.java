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

package com.ibm.cloud.schematics.v1.model;

import com.ibm.cloud.schematics.v1.model.CreateJobOptions;
import com.ibm.cloud.schematics.v1.model.JobData;
import com.ibm.cloud.schematics.v1.model.JobDataAction;
import com.ibm.cloud.schematics.v1.model.JobLogSummary;
import com.ibm.cloud.schematics.v1.model.JobLogSummaryActionJob;
import com.ibm.cloud.schematics.v1.model.JobLogSummaryActionJobRecap;
import com.ibm.cloud.schematics.v1.model.JobLogSummaryRepoDownloadJob;
import com.ibm.cloud.schematics.v1.model.JobStatus;
import com.ibm.cloud.schematics.v1.model.JobStatusAction;
import com.ibm.cloud.schematics.v1.model.SystemLock;
import com.ibm.cloud.schematics.v1.model.TargetResourceset;
import com.ibm.cloud.schematics.v1.model.VariableData;
import com.ibm.cloud.schematics.v1.model.VariableMetadata;
import com.ibm.cloud.schematics.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateJobOptions model.
 */
public class CreateJobOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateJobOptions() throws Throwable {
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
    assertEquals(variableMetadataModel.type(), "boolean");
    assertEquals(variableMetadataModel.aliases(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(variableMetadataModel.description(), "testString");
    assertEquals(variableMetadataModel.defaultValue(), "testString");
    assertEquals(variableMetadataModel.secure(), Boolean.valueOf(true));
    assertEquals(variableMetadataModel.immutable(), Boolean.valueOf(true));
    assertEquals(variableMetadataModel.hidden(), Boolean.valueOf(true));
    assertEquals(variableMetadataModel.options(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(variableMetadataModel.minValue(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.maxValue(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.minLength(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.maxLength(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.matches(), "testString");
    assertEquals(variableMetadataModel.position(), Long.valueOf("26"));
    assertEquals(variableMetadataModel.groupBy(), "testString");
    assertEquals(variableMetadataModel.source(), "testString");

    VariableData variableDataModel = new VariableData.Builder()
      .name("testString")
      .value("testString")
      .metadata(variableMetadataModel)
      .build();
    assertEquals(variableDataModel.name(), "testString");
    assertEquals(variableDataModel.value(), "testString");
    assertEquals(variableDataModel.metadata(), variableMetadataModel);

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
    assertEquals(jobStatusActionModel.actionName(), "testString");
    assertEquals(jobStatusActionModel.statusCode(), "job_pending");
    assertEquals(jobStatusActionModel.statusMessage(), "testString");
    assertEquals(jobStatusActionModel.bastionStatusCode(), "none");
    assertEquals(jobStatusActionModel.bastionStatusMessage(), "testString");
    assertEquals(jobStatusActionModel.targetsStatusCode(), "none");
    assertEquals(jobStatusActionModel.targetsStatusMessage(), "testString");
    assertEquals(jobStatusActionModel.updatedAt(), TestUtilities.createMockDateTime("2019-01-01T12:00:00"));

    JobStatus jobStatusModel = new JobStatus.Builder()
      .actionJobStatus(jobStatusActionModel)
      .build();
    assertEquals(jobStatusModel.actionJobStatus(), jobStatusActionModel);

    JobDataAction jobDataActionModel = new JobDataAction.Builder()
      .actionName("testString")
      .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
      .updatedAt(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
      .build();
    assertEquals(jobDataActionModel.actionName(), "testString");
    assertEquals(jobDataActionModel.inputs(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(jobDataActionModel.outputs(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(jobDataActionModel.settings(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(jobDataActionModel.updatedAt(), TestUtilities.createMockDateTime("2019-01-01T12:00:00"));

    JobData jobDataModel = new JobData.Builder()
      .jobType("repo_download_job")
      .actionJobData(jobDataActionModel)
      .build();
    assertEquals(jobDataModel.jobType(), "repo_download_job");
    assertEquals(jobDataModel.actionJobData(), jobDataActionModel);

    SystemLock systemLockModel = new SystemLock.Builder()
      .sysLocked(true)
      .sysLockedBy("testString")
      .sysLockedAt(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
      .build();
    assertEquals(systemLockModel.sysLocked(), Boolean.valueOf(true));
    assertEquals(systemLockModel.sysLockedBy(), "testString");
    assertEquals(systemLockModel.sysLockedAt(), TestUtilities.createMockDateTime("2019-01-01T12:00:00"));

    TargetResourceset targetResourcesetModel = new TargetResourceset.Builder()
      .name("testString")
      .type("testString")
      .description("testString")
      .resourceQuery("testString")
      .credential("testString")
      .sysLock(systemLockModel)
      .build();
    assertEquals(targetResourcesetModel.name(), "testString");
    assertEquals(targetResourcesetModel.type(), "testString");
    assertEquals(targetResourcesetModel.description(), "testString");
    assertEquals(targetResourcesetModel.resourceQuery(), "testString");
    assertEquals(targetResourcesetModel.credential(), "testString");
    assertEquals(targetResourcesetModel.sysLock(), systemLockModel);

    JobLogSummaryRepoDownloadJob jobLogSummaryRepoDownloadJobModel = new JobLogSummaryRepoDownloadJob.Builder()
      .build();

    JobLogSummaryActionJobRecap jobLogSummaryActionJobRecapModel = new JobLogSummaryActionJobRecap.Builder()
      .target(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .ok(Double.valueOf("72.5"))
      .changed(Double.valueOf("72.5"))
      .failed(Double.valueOf("72.5"))
      .skipped(Double.valueOf("72.5"))
      .unreachable(Double.valueOf("72.5"))
      .build();
    assertEquals(jobLogSummaryActionJobRecapModel.target(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(jobLogSummaryActionJobRecapModel.ok(), Double.valueOf("72.5"));
    assertEquals(jobLogSummaryActionJobRecapModel.changed(), Double.valueOf("72.5"));
    assertEquals(jobLogSummaryActionJobRecapModel.failed(), Double.valueOf("72.5"));
    assertEquals(jobLogSummaryActionJobRecapModel.skipped(), Double.valueOf("72.5"));
    assertEquals(jobLogSummaryActionJobRecapModel.unreachable(), Double.valueOf("72.5"));

    JobLogSummaryActionJob jobLogSummaryActionJobModel = new JobLogSummaryActionJob.Builder()
      .recap(jobLogSummaryActionJobRecapModel)
      .build();
    assertEquals(jobLogSummaryActionJobModel.recap(), jobLogSummaryActionJobRecapModel);

    JobLogSummary jobLogSummaryModel = new JobLogSummary.Builder()
      .jobType("repo_download_job")
      .repoDownloadJob(jobLogSummaryRepoDownloadJobModel)
      .actionJob(jobLogSummaryActionJobModel)
      .build();
    assertEquals(jobLogSummaryModel.jobType(), "repo_download_job");
    assertEquals(jobLogSummaryModel.repoDownloadJob(), jobLogSummaryRepoDownloadJobModel);
    assertEquals(jobLogSummaryModel.actionJob(), jobLogSummaryActionJobModel);

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
    assertEquals(createJobOptionsModel.refreshToken(), "testString");
    assertEquals(createJobOptionsModel.commandObject(), "workspace");
    assertEquals(createJobOptionsModel.commandObjectId(), "testString");
    assertEquals(createJobOptionsModel.commandName(), "workspace_init_flow");
    assertEquals(createJobOptionsModel.commandParameter(), "testString");
    assertEquals(createJobOptionsModel.commandOptions(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(createJobOptionsModel.inputs(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(createJobOptionsModel.settings(), new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)));
    assertEquals(createJobOptionsModel.tags(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(createJobOptionsModel.location(), "us_south");
    assertEquals(createJobOptionsModel.status(), jobStatusModel);
    assertEquals(createJobOptionsModel.data(), jobDataModel);
    assertEquals(createJobOptionsModel.bastion(), targetResourcesetModel);
    assertEquals(createJobOptionsModel.logSummary(), jobLogSummaryModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateJobOptionsError() throws Throwable {
    new CreateJobOptions.Builder().build();
  }

}