---
title: "Update notificationSettings"
description: "Update the properties of a notificationSettings object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update notificationSettings
Namespace: microsoft.graph



Update the properties of a [notificationSettings](../resources/notificationsettings.md) object.

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
PATCH /identityProtection/settings/notifications
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [notificationSettings](../resources/notificationsettings.md) object.

The following table shows the properties that are required when you update the [notificationSettings](../resources/notificationsettings.md).

|Property|Type|Description|
|:---|:---|:---|
|isWeeklyDigestEnabled|Boolean|**TODO: Add Description**|
|minRiskLevel|riskLevel|**TODO: Add Description**. Possible values are: `low`, `medium`, `high`, `hidden`, `none`, `unknownFutureValue`.|
|notificationRecipients|[Microsoft.IdentityProtectionServices.notificationRecipient](../resources/notificationrecipient.md) collection|**TODO: Add Description**|
|additionalRecipients|[Microsoft.IdentityProtectionServices.additionalRecipient](../resources/additionalrecipient.md) collection|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [notificationSettings](../resources/notificationsettings.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_notificationsettings"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/identityProtection/settings/notifications
Content-Type: application/json
Content-length: 352

{
  "@odata.type": "#microsoft.graph.notificationSettings",
  "isWeeklyDigestEnabled": "Boolean",
  "minRiskLevel": "String",
  "notificationRecipients": [
    {
      "@odata.type": "microsoft.graph.notificationRecipient"
    }
  ],
  "additionalRecipients": [
    {
      "@odata.type": "microsoft.graph.additionalRecipient"
    }
  ]
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.notificationSettings",
  "isWeeklyDigestEnabled": "Boolean",
  "minRiskLevel": "String",
  "notificationRecipients": [
    {
      "@odata.type": "microsoft.graph.notificationRecipient"
    }
  ],
  "additionalRecipients": [
    {
      "@odata.type": "microsoft.graph.additionalRecipient"
    }
  ]
}
```

