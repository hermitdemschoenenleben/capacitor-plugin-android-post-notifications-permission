# capacitor-plugin-android-post-notifications-permission

Used for acquiring POST_NOTIFICATIONS permission on android >= 13.
This is a workaround until https://github.com/ionic-team/capacitor-plugins/issues/1135 is fixed.

## Install

```bash
npm install capacitor-plugin-android-post-notifications-permission
npx cap sync
```

## API

<docgen-index>

* [`echo(...)`](#echo)
* [`checkPermissions()`](#checkpermissions)
* [`requestPermissions(...)`](#requestpermissions)
* [Interfaces](#interfaces)
* [Type Aliases](#type-aliases)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### echo(...)

```typescript
echo(options: { value: string; }) => Promise<{ value: string; }>
```

| Param         | Type                            |
| ------------- | ------------------------------- |
| **`options`** | <code>{ value: string; }</code> |

**Returns:** <code>Promise&lt;{ value: string; }&gt;</code>

--------------------


### checkPermissions()

```typescript
checkPermissions() => Promise<PermissionStatus>
```

**Returns:** <code>Promise&lt;<a href="#permissionstatus">PermissionStatus</a>&gt;</code>

--------------------


### requestPermissions(...)

```typescript
requestPermissions(permissions?: AndroidNotificationPermissionPluginPermissions | undefined) => Promise<PermissionStatus>
```

| Param             | Type                                                                                                                      |
| ----------------- | ------------------------------------------------------------------------------------------------------------------------- |
| **`permissions`** | <code><a href="#androidnotificationpermissionpluginpermissions">AndroidNotificationPermissionPluginPermissions</a></code> |

**Returns:** <code>Promise&lt;<a href="#permissionstatus">PermissionStatus</a>&gt;</code>

--------------------


### Interfaces


#### PermissionStatus

| Prop                    | Type                                                        |
| ----------------------- | ----------------------------------------------------------- |
| **`postNotifications`** | <code><a href="#permissionstate">PermissionState</a></code> |


#### AndroidNotificationPermissionPluginPermissions

| Prop              | Type                               |
| ----------------- | ---------------------------------- |
| **`permissions`** | <code>'postNotifications'[]</code> |


### Type Aliases


#### PermissionState

<code>'prompt' | 'prompt-with-rationale' | 'granted' | 'denied'</code>


#### AndroidNotificationPermissionType

<code>'postNotifications'</code>

</docgen-api>
