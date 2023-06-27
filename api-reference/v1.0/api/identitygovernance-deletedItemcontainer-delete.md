---
title: "Delete deletedItemContainer (permanently delete a deleted lifecycle workflow)"
description: "Permanently delete a deleted lifecycle workflow."
author: "AlexFilipin"
ms.localizationpriority: medium
ms.prod: "governance"
doc_type: apiPageType
---

# Delete deletedItemContainer (permanently delete a deleted lifecycle workflow)

Namespace: microsoft.graph.identityGovernance

Delete a [workflow](../resources/identitygovernance-workflow.md) object.

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
DELETE /identityGovernance/lifecycleWorkflows/deletedItems/workflows/{workflowId}/
```

## Request headers

|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body

Do not supply a request body for this method.

## Response

If successful, this method returns a `204 No Content` response code.

## Examples

### Request

The following is an example of a request.

<!-- {
  "blockType": "request",
  "name": "lifecycleworkflows_delete_deleteditems"
}
-->
``` http
DELETE https://graph.microsoft.com/v1.0/identityGovernance/lifecycleWorkflows/deletedItems/workflows/{workflowId}
```

### Response

<!-- {
  "blockType": "response",
  "truncated": true
  
}
-->
``` http
HTTP/1.1 204 No Content
```
