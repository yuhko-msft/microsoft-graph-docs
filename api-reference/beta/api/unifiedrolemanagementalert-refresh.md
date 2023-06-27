---
title: "unifiedRoleManagementAlert: refresh"
description: "Refresh incidents on all security alerts or on a single security alert in Privileged Identity Management (PIM) for Azure AD roles."
author: "rkarim-ms"
ms.localizationpriority: medium
ms.prod: "governance"
doc_type: apiPageType
---

# unifiedRoleManagementAlert: refresh
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Refresh incidents on all security alerts or on a single security alert in Privileged Identity Management (PIM) for Azure AD roles.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|RoleManagementAlert.ReadWrite.Directory|
|Delegated (personal Microsoft account)|Not supported|
|Application|RoleManagementAlert.ReadWrite.Directory|

[!INCLUDE [rbac-pim-alerts-apis-write](../includes/rbac-for-apis/rbac-pim-alerts-apis-write.md)]

## HTTP requests

To refresh incidents on all alerts, use the following request.
<!-- {
  "blockType": "ignored"
}
-->
``` http
POST /identityGovernance/roleManagementAlerts/alerts/refresh
```

To refresh a single alert, use the below request.
<!-- {
  "blockType": "ignored"
}
-->
``` http
POST /identityGovernance/roleManagementAlerts/alerts/{alertId}/refresh
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
For refreshing incidents on all alerts (refresh collection of alerts), in the request body, supply a JSON representation of the parameters.

The following table shows the parameters that can be used with this action.

|Parameter|Type|Description|
|:---|:---|:---|
|scopeType|String|The type of the scope where the alert is created. `DirectoryRole` is the only supported one for Azure AD roles. |
|scopeId|String|The identifier of the scope where the alert applies. `/` is the only supported one for the tenant.|

For refreshing a single alert, do not specify a request body.

## Response

If successful, this action returns a `202 Accepted` response code with a 'Location' header which specifies the URL for polling the operation status.

## Examples

### Example 1: Refresh all the alerts under a resource scope like a tenant

#### Request

The following is an example of a request.
<!-- {
  "blockType": "request",
  "name": "unifiedrolemanagementalert_refresh_all"
}
-->
``` http
POST https://graph.microsoft.com/beta/identityGovernance/roleManagementAlerts/alerts/refresh
Content-Type: application/json

{
    "scopeId" : "/",
    "scopeType" : "DirectoryRole"
}
```

#### Response
The following is an example of the response.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 202 Accepted
Content-Type: application/json
Location: https://graph.microsoft.com/beta/identityGovernance/roleManagementAlerts/operations/5c5670d6-a2c0-a394-ef42-882954856de5
```

### Example 2: Refresh a single alert under a resource scope like a tenant

#### Request

The following is an example of a request.
<!-- {
  "blockType": "request",
  "name": "unifiedrolemanagementalert_refresh_single"
}
-->
``` http
POST https://graph.microsoft.com/beta/identityGovernance/roleManagementAlerts/alerts/DirectoryRole_19356be4-7e93-4ed6-a7c6-0ae28454d125_TooManyGlobalAdminsAssignedToTenantAlert/refresh

```

#### Response
The following is an example of the response.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 202 Accepted
Location: https://graph.microsoft.com/beta/identityGovernance/roleManagementAlerts/operations/7d6771e9-e1d0-a344-fg41-882954856ed7
```