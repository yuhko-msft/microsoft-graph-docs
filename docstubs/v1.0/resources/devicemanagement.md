---
title: "deviceManagement resource type"
description: "Singleton entity that acts as a container for all device management functionality."
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# deviceManagement resource type

Namespace: microsoft.graph

Singleton entity that acts as a container for all device management functionality.

## Methods

| Method                                                                                                        | Return Type                                        | Description                                                                                                    |
| :------------------------------------------------------------------------------------------------------------ | :------------------------------------------------- | :------------------------------------------------------------------------------------------------------------- |
| [List deviceManagement](../api/devicemanagement-list.md)                                                      | [deviceManagement](deviceManagement.md) collection | List properties and relationships of a deviceManagement object.                                                |
| [Create deviceManagement](../api/devicemanagement-create.md)                                                  | [deviceManagement](deviceManagement.md)            | Create a new deviceManagement object.                                                                          |
| [Get deviceManagement](../api/devicemanagement-get.md)                                                        | [deviceManagement](deviceManagement.md)            | Read properties and relationships of a deviceManagement object.                                                |
| [Update deviceManagement](../api/devicemanagement-update.md)                                                  | [deviceManagement](deviceManagement.md)            | Update the properties of a deviceManagement object.                                                            |
| [Delete deviceManagement](../api/devicemanagement-delete.md)                                                  |                                                    | Delete a deviceManagement object.                                                                              |
| [List applePushNotificationCertificate](../api/devicemanagement-list-applepushnotificationcertificate.md)     | applePushNotificationCertificate                   | Get the applePushNotificationCertificate objects from an applePushNotificationCertificate navigation property. |
| [Create applePushNotificationCertificate](../api/devicemanagement-post-applepushnotificationcertificate.md)   | applePushNotificationCertificate                   | Create a new applePushNotificationCertificate object.                                                          |
| [Get applePushNotificationCertificate](../api/devicemanagement-get-applepushnotificationcertificate.md)       | applePushNotificationCertificate                   | Read the properties and relationships of an applePushNotificationCertificate object.                           |
| [Update applePushNotificationCertificate](../api/devicemanagement-update-applepushnotificationcertificate.md) | applePushNotificationCertificate                   | Update the properties of an applePushNotificationCertificate object.                                           |
| [Delete applePushNotificationCertificate](../api/devicemanagement-delete-applepushnotificationcertificate.md) |                                                    | Delete an applePushNotificationCertificate object.                                                             |
| [List detectedApps](../api/devicemanagement-list-detectedapps.md)                                             | detectedApp                                        | Get the detectedApp objects from a detectedApps navigation property.                                           |
| [Create detectedApps](../api/devicemanagement-post-detectedapps.md)                                           | detectedApp                                        | Create a new detectedApp object.                                                                               |
| [Get detectedApps](../api/devicemanagement-get-detectedapps.md)                                               | detectedApp                                        | Read the properties and relationships of a detectedApp object.                                                 |
| [Update detectedApps](../api/devicemanagement-update-detectedapps.md)                                         | detectedApp                                        | Update the properties of a detectedApp object.                                                                 |
| [Delete detectedApps](../api/devicemanagement-delete-detectedapps.md)                                         |                                                    | Delete a detectedApp object.                                                                                   |
| [List managedDeviceOverview](../api/devicemanagement-list-manageddeviceoverview.md)                           | managedDeviceOverview                              | Get the managedDeviceOverview objects from a managedDeviceOverview navigation property.                        |
| [Add managedDeviceOverview](../api/devicemanagement-post-manageddeviceoverview.md)                            | managedDeviceOverview                              | Add managedDeviceOverview by posting to the managedDeviceOverview collection.                                  |
| [Get managedDeviceOverview](../api/devicemanagement-get-manageddeviceoverview.md)                             | managedDeviceOverview                              | Read the properties and relationships of a managedDeviceOverview object.                                       |
| [Update managedDeviceOverview](../api/devicemanagement-update-manageddeviceoverview.md)                       | managedDeviceOverview                              | Update the properties of a managedDeviceOverview object.                                                       |
| [Remove managedDeviceOverview](../api/devicemanagement-delete-manageddeviceoverview.md)                       |                                                    | Remove a managedDeviceOverview object.                                                                         |
| [List managedDevices](../api/devicemanagement-list-manageddevices.md)                                         | managedDevice                                      | Get the managedDevice objects from a managedDevices navigation property.                                       |
| [Create managedDevices](../api/devicemanagement-post-manageddevices.md)                                       | managedDevice                                      | Create a new managedDevice object.                                                                             |
| [Get managedDevices](../api/devicemanagement-get-manageddevices.md)                                           | managedDevice                                      | Read the properties and relationships of a managedDevice object.                                               |
| [Update managedDevices](../api/devicemanagement-update-manageddevices.md)                                     | managedDevice                                      | Update the properties of a managedDevice object.                                                               |
| [Delete managedDevices](../api/devicemanagement-delete-manageddevices.md)                                     |                                                    | Delete a managedDevice object.                                                                                 |

## Properties

| Property          | Type   | Description                                         |
| :---------------- | :----- | :-------------------------------------------------- |
| id                | String | Unique Identifier for the device Read-only.         |
| subscriptionState | String | Tenant mobile device management subscription state. |

## Relationships

| Relationship                     | Type                                                                                 | Description                                         |
| :------------------------------- | :----------------------------------------------------------------------------------- | :-------------------------------------------------- |
| applePushNotificationCertificate | [applePushNotificationCertificate](../resources/applepushnotificationcertificate.md) | Apple push notification certificate.                |
| detectedApps                     | [detectedApp](../resources/detectedapp.md) collection                                | The list of detected apps associated with a device. |
| managedDeviceOverview            | [managedDeviceOverview](../resources/manageddeviceoverview.md)                       | Device overview                                     |
| managedDevices                   | [managedDevice](../resources/manageddevice.md) collection                            | The list of managed devices.                        |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagement",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.deviceManagement",
  "id": "String (identifier)",
  "subscriptionState": "pending | active | warning | disabled | deleted | blocked | lockedOut"
}
```