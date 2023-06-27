---
title: "Update workflow"
description: "Update the properties of a workflow object."
author: "AlexFilipin"
ms.localizationpriority: medium
ms.prod: "governance"
doc_type: apiPageType
---

# Update workflow

Namespace: microsoft.graph.identityGovernance

Update the properties of a [workflow](../resources/identitygovernance-workflow.md) object. Only the properties listed in the [request body](identitygovernance-workflow-update.md#request-body) table can be updated. To update any other workflow properties, see [workflow: createNewVersion](identitygovernance-workflow-createnewversion.md).

## Permissions

One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|LifecycleWorkflows.ReadWrite.All|
|Delegated (personal Microsoft account)|Not supported.|
|Application|LifecycleWorkflows.ReadWrite.All|

[!INCLUDE [rbac-lifecycle-workflows-apis-write](../includes/rbac-for-apis/rbac-lifecycle-workflows-apis-write.md)]

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
PATCH /identityGovernance/lifecycleWorkflows/workflows/{workflowId}
```

## Request headers

|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body

[!INCLUDE [table-intro](../../includes/update-property-table-intro.md)]

|Property|Type|Description|
|:---|:---|:---|
|description|String|Describes the purpose of the workflow for administrative use.|
|displayName|String|A unique string that identifies the workflow.|
|isEnabled|Boolean|A boolean value that denotes whether the workflow is set to run or not.|
|isSchedulingEnabled|Boolean|A Boolean value that denotes whether scheduling is enabled or not. |

> [!NOTE]
> You can also update task name and description within a workflow without creating a new version. For more information on these properties, see: [update task](identitygovernance-task-update.md).

## Response

If successful, this action returns a `204 No Content` response code.

## Examples

### Request

The following is an example of a request.

<!-- {
  "blockType": "request",
  "name": "lifecycleworkflows_update_workflow"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/identityGovernance/lifecycleWorkflows/workflows/156ce798-1eb6-4e0a-8515-e79f54d04390
Content-Type: application/json
Content-length: 454

{
    "description": "Configure new hire tasks for onboarding employees on their first day",
    "displayName": "Australia Onboard new hire employee",
    "isEnabled": true,
    "isSchedulingEnabled": false
}
```

### Response

<!-- {
  "blockType": "response",
  "truncated": true,

}
-->
``` http
HTTP/1.1 204 No Content
```
