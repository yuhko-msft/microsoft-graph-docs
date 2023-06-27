---
title: "Update lifecycleManagementSettings"
description: "Update the properties of a lifecycleManagementSettings object."
author: "AlexFilipin"
ms.localizationpriority: medium
ms.prod: "governance"
doc_type: apiPageType
---

# Update lifecycleManagementSettings

Namespace: microsoft.graph.identityGovernance

Update the properties of a [lifecycleManagementSettings](../resources/identitygovernance-lifecyclemanagementsettings.md) object.

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
PATCH /identityGovernance/lifecycleWorkflows/settings
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
|workflowScheduleIntervalInHours|Int32|The workflow schedule interval. Required.|
|emailSettings|[microsoft.graph.emailSettings](../resources/emailsettings.md)|The settings for emails sent from email-specific tasks within a workflow. Required.|

## Response

If successful, this action returns a `204 No Content` response code.

## Examples

### Request

The following is an example of a request.

<!-- {
  "blockType": "request",
  "name": "lifecycleworkflows_update_lifecyclemanagementsettings"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/identityGovernance/lifecycleWorkflows/settings
Content-Type: application/json

{
    "@odata.context": "https://graph.microsoft.com/v1.0/$metadata#identityGovernance/lifecycleWorkflows/settings/$entity",
    "workflowScheduleIntervalInHours": 3,
    "emailSettings": {
        "senderDomain": "ContosoIndustries.net",
        "useCompanyBranding": true
  }
}
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
