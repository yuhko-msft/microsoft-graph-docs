---
title: "List executionScope"
description: "Get a list of the user objects in scope of execution for a workflow."
author: "AlexFilipin"
ms.localizationpriority: medium
ms.prod: "governance"
doc_type: apiPageType
---

# List executionScope

Namespace: microsoft.graph.identityGovernance

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

List the users that meet the [execution conditions](../resources/identitygovernance-workflowexecutionconditions.md) regardless of whether they have already been processed by the [workflow](../resources/identitygovernance-workflow.md).

The workflow engine periodically evaluates the users that meet the execution conditions. The results will not be up to date if the execution conditions have been changed recently, relevant attributes on the user have been changed recently or the [time based trigger](../resources/identitygovernance-timebasedattributetrigger.md) has been reached recently.

The API is only supported for workflows with [trigger and scope based](../resources/identitygovernance-triggerandscopebasedconditions.md) [execution conditions](../resources/identitygovernance-workflowexecutionconditions.md). Furthermore, results are only returned if the workflows schedule (isSchedulingEnabled) is enabled.

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
GET /identitygovernance/lifecycleWorkflows/workflows/{workflowId}/executionScope
```

## Optional query parameters

This method supports the `$select`, `$expand`, `$orderBy`, and `$filter` OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers

|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body

Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a collection of [microsoft.graph.identityGovernance.userProcessingResult](../resources/identitygovernance-userprocessingresult.md) objects in the response body.

## Examples

### Request

The following is an example of a request.

<!-- {
  "blockType": "request",
  "name": "lifecycleworkflows_list_executionScope_e1"
}
-->
``` http
GET https://graph.microsoft.com/beta/identitygovernance/lifecycleWorkflows/workflows/8696088c-1aef-4f65-afe9-acd55343e327/executionScope
```

### Response

The following is an example of the response.
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.identityGovernance.userProcessingResult)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "@odata.context": "https://graph.microsoft.com/beta/$metadata#identityGovernance/lifecycleWorkflows/workflows('156ce798-1eb6-4e0a-8515-e79f54d04390')/userProcessingResults",
    "value": [
        {
            "id": "e831ffea-4156-482a-ba43-a8161f83efa8",
            "completedDateTime": "2022-08-24T18:27:43.1283747Z",
            "failedTasksCount": 1,
            "processingStatus": "failed",
            "scheduledDateTime": "2022-08-24T18:27:28.4105696Z",
            "startedDateTime": "2022-08-24T18:27:34.47941Z",
            "totalTasksCount": 3,
            "totalUnprocessedTasksCount": 2,
            "workflowExecutionType": "onDemand",
            "workflowVersion": 1,
            "subject": {
                "id": "b276ff04-835d-414c-a2a7-5c59e37cccc9"
            }
        },
        {
            "id": "c1fab0b4-222d-4bdf-ab09-eb99fc5a8061",
            "completedDateTime": "2022-08-24T18:35:53.5871731Z",
            "failedTasksCount": 1,
            "processingStatus": "failed",
            "scheduledDateTime": "2022-08-24T18:35:39.0021384Z",
            "startedDateTime": "2022-08-24T18:35:48.0824202Z",
            "totalTasksCount": 3,
            "totalUnprocessedTasksCount": 2,
            "workflowExecutionType": "onDemand",
            "workflowVersion": 1,
            "subject": {
                "id": "b276ff04-835d-414c-a2a7-5c59e37cccc9"
            }
        },
        {
            "id": "0481a153-f437-45f0-b07c-ebe1008f10c5",
            "completedDateTime": "2022-08-24T23:26:41.4425594Z",
            "failedTasksCount": 0,
            "processingStatus": "completed",
            "scheduledDateTime": "2022-08-24T23:26:24.1178409Z",
            "startedDateTime": "2022-08-24T23:26:29.315238Z",
            "totalTasksCount": 2,
            "totalUnprocessedTasksCount": 0,
            "workflowExecutionType": "onDemand",
            "workflowVersion": 13,
            "subject": {
                "id": "ea09ac2e-77e3-4134-85f2-25ccf3c33387"
            }
        }
    ]
}
```
