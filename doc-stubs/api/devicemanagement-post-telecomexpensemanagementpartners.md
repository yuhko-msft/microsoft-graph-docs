---
title: "Create telecomExpenseManagementPartner"
description: "Create a new telecomExpenseManagementPartner object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create telecomExpenseManagementPartner
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new telecomExpenseManagementPartner object.

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
POST /deviceManagement/telecomExpenseManagementPartners
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [telecomExpenseManagementPartner](../resources/telecomexpensemanagementpartner.md) object.

The following table shows the properties that are required when you create the [telecomExpenseManagementPartner](../resources/telecomexpensemanagementpartner.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|appAuthorized|Boolean|Whether the partner's AAD app has been authorized to access Intune.|
|displayName|String|Display name of the TEM partner.|
|enabled|Boolean|Whether Intune's connection to the TEM service is currently enabled or disabled.|
|lastConnectionDateTime|DateTimeOffset|Timestamp of the last request sent to Intune by the TEM partner.|
|url|String|URL of the TEM partner's administrative control panel, where an administrator can configure their TEM service.|



## Response

If successful, this method returns a `201 Created` response code and a [telecomExpenseManagementPartner](../resources/telecomexpensemanagementpartner.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_telecomexpensemanagementpartner_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/deviceManagement/telecomExpenseManagementPartners
Content-Type: application/json
Content-length: 228

{
  "@odata.type": "#microsoft.graph.telecomExpenseManagementPartner",
  "appAuthorized": "Boolean",
  "displayName": "String",
  "enabled": "Boolean",
  "lastConnectionDateTime": "String (timestamp)",
  "url": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.telecomExpenseManagementPartner"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.telecomExpenseManagementPartner",
  "id": "9e17cbff-cbff-9e17-ffcb-179effcb179e",
  "appAuthorized": "Boolean",
  "displayName": "String",
  "enabled": "Boolean",
  "lastConnectionDateTime": "String (timestamp)",
  "url": "String"
}
```

