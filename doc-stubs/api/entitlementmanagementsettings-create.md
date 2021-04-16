---
title: "Create entitlementManagementSettings"
description: "Create a new entitlementManagementSettings object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create entitlementManagementSettings
Namespace: microsoft.graph



Create a new [entitlementManagementSettings](../resources/entitlementmanagementsettings.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
POST ** Collection URI for microsoft.graph.entitlementManagementSettings not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [entitlementManagementSettings](../resources/entitlementmanagementsettings.md) object.

The following table shows the properties that are required when you create the [entitlementManagementSettings](../resources/entitlementmanagementsettings.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|daysUntilExternalUserDeletedAfterBlocked|Int32|**TODO: Add Description**|
|externalUserLifecycleAction|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [entitlementManagementSettings](../resources/entitlementmanagementsettings.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_entitlementmanagementsettings_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.entitlementManagementSettings not found
Content-Type: application/json
Content-length: 173

{
  "@odata.type": "#microsoft.graph.entitlementManagementSettings",
  "daysUntilExternalUserDeletedAfterBlocked": "Integer",
  "externalUserLifecycleAction": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.entitlementManagementSettings"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.entitlementManagementSettings",
  "id": "525d1c52-1c52-525d-521c-5d52521c5d52",
  "daysUntilExternalUserDeletedAfterBlocked": "Integer",
  "externalUserLifecycleAction": "String"
}
```

