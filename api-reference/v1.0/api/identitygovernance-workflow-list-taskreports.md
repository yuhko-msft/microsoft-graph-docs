---
title: "List taskReports"
description: "Get a list of the taskReport objects and their properties for a lifecycle workflow."
author: "AlexFilipin"
ms.localizationpriority: medium
ms.prod: "governance"
doc_type: apiPageType
---

# List taskReports

Namespace: microsoft.graph.identityGovernance

Get a list of the [taskReport](../resources/identitygovernance-taskreport.md) objects and their properties.

## Permissions

One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|LifecycleWorkflows.Read.All, LifecycleWorkflows.ReadWrite.All|
|Delegated (personal Microsoft account)|Not supported.|
|Application|LifecycleWorkflows.Read.All, LifecycleWorkflows.ReadWrite.All|

[!INCLUDE [rbac-lifecycle-workflows-apis-read](../includes/rbac-for-apis/rbac-lifecycle-workflows-apis-read.md)]

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
GET /identityGovernance/lifecycleWorkflows/workflows/{workflowId}/taskReports
```

## Optional query parameters

This method supports the `$select`, `$orderBy`, `$expand`, and `$filter` OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers

|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body

Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a collection of [microsoft.graph.identityGovernance.taskReport](../resources/identitygovernance-taskreport.md) objects in the response body.

## Examples

### Example 1: List the task reports for a workflow

#### Request

The following is an example of a request.

<!-- {
  "blockType": "request",
  "name": "lifecycleworkflows_list_taskreport"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/identityGovernance/lifecycleWorkflows/workflows/14879e66-9ea9-48d0-804d-8fea672d0341/taskReports
```

#### Response

The following is an example of the response.
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.identityGovernance.taskReport)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "@odata.context": "https://graph.microsoft.com/v1.0/$metadata#identityGovernance/lifecycleWorkflows/workflows('14879e66-9ea9-48d0-804d-8fea672d0341')/taskReports",
    "@odata.count": 4,
    "value": [
        {
            "id": "3a3bea11-99ca-462d-86fb-d283db8d734a",
            "runId": "dad77a47-6eda-4de7-bc37-fe8eb5aaf17d",
            "processingStatus": "completed",
            "successfulUsersCount": 2,
            "failedUsersCount": 0,
            "unprocessedUsersCount": 0,
            "totalUsersCount": 2,
            "startedDateTime": "2022-08-24T23:28:04.5785337Z",
            "completedDateTime": "2022-08-24T23:28:11.1348863Z",
            "lastUpdatedDateTime": "2022-08-24T23:33:09.1980352Z"
        },
        {
            "id": "23f37fcb-040d-4ee9-91df-1234700ebeb6",
            "runId": "dad77a47-6eda-4de7-bc37-fe8eb5aaf17d",
            "processingStatus": "completed",
            "successfulUsersCount": 2,
            "failedUsersCount": 0,
            "unprocessedUsersCount": 0,
            "totalUsersCount": 2,
            "startedDateTime": "2022-08-24T23:28:04.5861287Z",
            "completedDateTime": "2022-08-24T23:28:11.1348863Z",
            "lastUpdatedDateTime": "2022-08-24T23:33:09.2051571Z"
        },
        {
            "id": "462e6deb-a7b4-4777-a494-389c495862b8",
            "runId": "a512bb50-3423-4bdc-ad5e-9731095b3b9a",
            "processingStatus": "completed",
            "successfulUsersCount": 2,
            "failedUsersCount": 0,
            "unprocessedUsersCount": 0,
            "totalUsersCount": 2,
            "startedDateTime": "2022-08-25T00:15:05.25581Z",
            "completedDateTime": "2022-08-25T00:15:11.8535443Z",
            "lastUpdatedDateTime": "2022-08-25T00:20:05.8759088Z"
        },
        {
            "id": "e3dd0719-a50a-463d-b32d-7176fa4519e4",
            "runId": "a512bb50-3423-4bdc-ad5e-9731095b3b9a",
            "processingStatus": "completed",
            "successfulUsersCount": 2,
            "failedUsersCount": 0,
            "unprocessedUsersCount": 0,
            "totalUsersCount": 2,
            "startedDateTime": "2022-08-25T00:15:05.2771389Z",
            "completedDateTime": "2022-08-25T00:15:11.8535443Z",
            "lastUpdatedDateTime": "2022-08-25T00:20:05.9002556Z"
        }
    ]
}
```

### Example 2: List the task reports for a workflow

#### Request

The following is an example of a request.

<!-- {
  "blockType": "request",
  "name": "lifecycleworkflows_list_taskreport_select"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/identityGovernance/lifecycleWorkflows/workflows/15239232-66ed-445b-8292-2f5bbb2eb833/taskReports?$select=id,failedUsersCount,processingStatus,successfulUsersCount,totalUsersCount,unprocessedUsersCount,taskDefinition,taskProcessingResults
```

#### Response

The following is an example of the response.
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.identityGovernance.taskReport)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "@odata.context": "https://graph.microsoft.com/v1.0/$metadata#identityGovernance/lifecycleWorkflows/workflows('15239232-66ed-445b-8292-2f5bbb2eb833')/taskReports(id,failedUsersCount,processingStatus,successfulUsersCount,totalUsersCount,unprocessedUsersCount,taskDefinition,taskProcessingResults)",
    "value": [
        {
            "id": "443c7611-45df-48c0-bf5e-dc6068c402f0",
            "processingStatus": "completed",
            "successfulUsersCount": 1,
            "failedUsersCount": 0,
            "unprocessedUsersCount": 0,
            "totalUsersCount": 1
        },
        {
            "id": "92bbb4a0-3815-48a7-8f83-f5dadc4f6793",
            "processingStatus": "completed",
            "successfulUsersCount": 1,
            "failedUsersCount": 0,
            "unprocessedUsersCount": 0,
            "totalUsersCount": 1
        },
        {
            "id": "d64d2b78-3823-4ec8-b6d3-efd3d41a5e98",
            "processingStatus": "completed",
            "successfulUsersCount": 1,
            "failedUsersCount": 0,
            "unprocessedUsersCount": 0,
            "totalUsersCount": 1
        }
    ]
}
```
