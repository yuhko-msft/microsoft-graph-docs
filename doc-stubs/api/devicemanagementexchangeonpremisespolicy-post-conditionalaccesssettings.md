---
title: "Create onPremisesConditionalAccessSettings"
description: "Create a new onPremisesConditionalAccessSettings object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create onPremisesConditionalAccessSettings
Namespace: microsoft.graph



Create a new onPremisesConditionalAccessSettings object.

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
POST /deviceManagement/exchangeOnPremisesPolicies/{deviceManagementExchangeOnPremisesPolicyId}/conditionalAccessSettings
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [onPremisesConditionalAccessSettings](../resources/onpremisesconditionalaccesssettings.md) object.

The following table shows the properties that are required when you create the [onPremisesConditionalAccessSettings](../resources/onpremisesconditionalaccesssettings.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|enabled|Boolean|Indicates if on premises conditional access is enabled for this organization|
|excludedGroups|Guid collection|User groups that will be exempt by on premises conditional access. All users in these groups will be exempt from the conditional access policy.|
|includedGroups|Guid collection|User groups that will be targeted by on premises conditional access. All users in these groups will be required to have mobile device managed and compliant for mail access.|
|overrideDefaultRule|Boolean|Override the default access rule when allowing a device to ensure access is granted.|



## Response

If successful, this method returns a `201 Created` response code and an [onPremisesConditionalAccessSettings](../resources/onpremisesconditionalaccesssettings.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_onpremisesconditionalaccesssettings_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/exchangeOnPremisesPolicies/{deviceManagementExchangeOnPremisesPolicyId}/conditionalAccessSettings
Content-Type: application/json
Content-length: 221

{
  "@odata.type": "#microsoft.graph.onPremisesConditionalAccessSettings",
  "enabled": "Boolean",
  "excludedGroups": [
    "Guid"
  ],
  "includedGroups": [
    "Guid"
  ],
  "overrideDefaultRule": "Boolean"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.onPremisesConditionalAccessSettings"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.onPremisesConditionalAccessSettings",
  "id": "3b00506f-506f-3b00-6f50-003b6f50003b",
  "enabled": "Boolean",
  "excludedGroups": [
    "Guid"
  ],
  "includedGroups": [
    "Guid"
  ],
  "overrideDefaultRule": "Boolean"
}
```

